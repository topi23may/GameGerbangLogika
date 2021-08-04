package com.destiny.gamegerbanglogika.Method;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import androidx.core.content.FileProvider;

import com.destiny.gamegerbanglogika.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Method {

    public String MagicRP(double nilai){
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        BigDecimal bd1 = new BigDecimal(nilai).setScale(0, RoundingMode.HALF_UP);
        return formatRupiah.format(bd1);
    }
    public String BatasanDouble2(double nilai){
        BigDecimal bd1 = new BigDecimal(nilai).setScale(2, RoundingMode.HALF_UP);
        return String.valueOf(bd1);
    }
    public String BatasanDouble(double nilai){
        BigDecimal bd1 = new BigDecimal(nilai).setScale(0, RoundingMode.HALF_UP);
        return String.valueOf(bd1);
    }
    public String KategoriFMCG(String kategori){
        String hasil=kategori.toLowerCase();
        if (kategori.equals("F&B")){
            hasil="food";
        }else if(kategori.equals("NON F&B")){
            hasil="non food";
        }
        return hasil;
    }
    public String Tanggal(String tanggal){
        String tgl = tanggal.substring(8,10);
        String bulan = tanggal.substring(5,7);
        String tahun = tanggal.substring(0,4);
        String Bulan = "Januari";
        if (bulan.equals("01")){
            Bulan = "Januari";
        }else if(bulan.equals("02")){
            Bulan = "Februari";
        }else if(bulan.equals("03")){
            Bulan = "Maret";
        }else if(bulan.equals("04")){
            Bulan = "April";
        }else if(bulan.equals("05")){
            Bulan = "Mei";
        }else if(bulan.equals("06")){
            Bulan = "Juni";
        }else if(bulan.equals("07")){
            Bulan = "Juli";
        }else if(bulan.equals("08")){
            Bulan = "Agustus";
        }else if(bulan.equals("09")){
            Bulan = "September";
        }else if(bulan.equals("10")){
            Bulan = "Oktober";
        }else if(bulan.equals("11")){
            Bulan = "November";
        }else if(bulan.equals("12")){
            Bulan = "Desember";
        }
        return tgl+" "+Bulan+" "+tahun;
    }
    public String PembulatanHari(String hari){
        Double hari1 = Double.parseDouble(BatasanDouble(Double.parseDouble(hari)));
        Double total = Double.parseDouble(hari)-hari1;
        Integer thot = Integer.parseInt(BatasanDouble(Double.parseDouble(hari)));
        if (total>0){
            thot=thot+1;
        }
        return String.valueOf(thot);
    }
    public void Download(final Context ctx, final String file, final String link, final String nama){
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setMessage("Download File ?")
                .setCancelable(false)
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if (file.equals("pdf")){
                            DownloadPDF(link,nama,ctx);
                        }else{
                            DownloadPPT(link,nama,ctx);
                        }
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                //Set your icon here
                .setTitle("Perhatian !!!")
                .setIcon(R.drawable.ic_print_black_24dp);
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void copyReadAssets(Context context, String assetName) {
        AssetManager assetManager = context.getAssets();

        InputStream in;
        OutputStream out;
        File directoryFile = new File(Environment.getExternalStorageDirectory().toString() + "/faba");

        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }

        File file = new File(directoryFile, assetName);
        try {
            in = assetManager.open(assetName);
            out = new FileOutputStream(file);
            copyFile(in, out);
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri fileUri = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setDataAndType(
                fileUri,
                "application/pdf");

        PackageManager pm = context.getPackageManager();
        if (intent.resolveActivity(pm) != null) {
            context.startActivity(intent);
        } else {
            String appPackage = "com.google.android.apps.pdfviewer";
            try {
                String appPackName = "market://details?id="+appPackage;
                context.startActivity(
                        new Intent(Intent.ACTION_VIEW, Uri.parse(appPackName))
                );
            } catch (ActivityNotFoundException anfe) {
                String appPackName = "https://play.google.com/store/apps/details?id="+appPackage;
                context.startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse(appPackName)
                        )
                );
            }
        }
    }

    public String MagicChange(String magic){
        String MAGIC1 = magic.replace("Rp","");
        String MAGIC2 = MAGIC1.replace(",","");
        return MAGIC2.replace(".","");
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }


    public String getToday(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String thisDay = dateFormat.format(date);
        String today = dayName(thisDay,"dd/MM/yyyy");
        String HariIni = "Senin";
        if(today.equals("Monday")){
            HariIni = "Senin";
        }else if(today.equals("Tuesday")){
            HariIni = "Selasa";
        }else if(today.equals("Wednesday")){
            HariIni = "Rabu";
        }else if(today.equals("Thursday")){
            HariIni = "Kamis";
        }else if(today.equals("Friday")){
            HariIni = "Jumat";
        }else if(today.equals("Saturday")){
            HariIni = "Sabtu";
        }else if(today.equals("Sunday")){
            HariIni = "Minggu";
        }
        return HariIni;
    }
    public static String dayName(String inputDate, String format){
        Date date = null;
        try {
            date = new SimpleDateFormat(format).parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }

    public void DownloadPDF(String url,String judul,Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness_Profile/"+judul+".pdf");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
    public void ViewPPT(String link,Context ctx){
        Uri uri = Uri.parse(link);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(uri,"application/vnd.openxmlformats-officedocument.presentationml.slideshow");
        ctx.startActivity(intent);
    }
    public void DownloadPPT(String url,String judul,Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness_Profile/"+judul+".ppsx");
        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }

    public void DownloadExcel(String url,String judul,Context ctx){
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(judul);
        request.setDescription("Downloading "+judul);

        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"/eBusiness_Profile/"+judul+".xls");

        DownloadManager manager = (DownloadManager)ctx.getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
}

