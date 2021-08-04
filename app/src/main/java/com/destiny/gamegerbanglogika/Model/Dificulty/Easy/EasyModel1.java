package com.destiny.gamegerbanglogika.Model.Dificulty.Easy;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class EasyModel1 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"2",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "AND",
                    "XNOR",
                    "OR",
                    "OR"
            },
            {"3",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "NAND",
                    "XOR",
                    "AND",
                    "AND"
            },
            {"4",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "NOR"
            },
            {"5",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND"
            },
            {"6",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NAND",
                    "XOR",
                    "NAND"
            },
            {"7",
                    String.valueOf(R.drawable.easy_off_on_mati),
                    String.valueOf(R.drawable.easy_off_on_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND"
            },
            {"8",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "AND",
                    "XOR",
                    "NOR",
                    "AND"
            },
            {"9",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR"
            },
            {"10",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "OR",
                    "XOR",
                    "NOR",
                    "OR"
            },
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNo(aData[0]);
            models.setGambar(aData[1]);
            models.setGambar2(aData[2]);
            models.setJawaban1(aData[3]);
            models.setJawaban2(aData[4]);
            models.setJawaban3(aData[5]);
            models.setJawaban(aData[6]);
            list.add(models);
        }
        return list;
    }
}
