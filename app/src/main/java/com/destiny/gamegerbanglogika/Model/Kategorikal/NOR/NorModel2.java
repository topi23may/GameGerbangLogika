package com.destiny.gamegerbanglogika.Model.Kategorikal.NOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NorModel2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NOR",
                    "XOR",
                    "NOR"
            },
            {"2",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            //Normal
            {"3",
                    String.valueOf(R.drawable.normal_3_nor_mati),
                    String.valueOf(R.drawable.normal_3_nor_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR"
            },
            {"4",
                    String.valueOf(R.drawable.normal_4_nor_mati),
                    String.valueOf(R.drawable.normal_4_nor_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "NAND"
            },
            {"5",
                    String.valueOf(R.drawable.normal_5_nor_mati),
                    String.valueOf(R.drawable.normal_5_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_6_nor_mati),
                    String.valueOf(R.drawable.normal_6_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            //Hard
            {"7",
                    String.valueOf(R.drawable.hard_3_nor_mati),
                    String.valueOf(R.drawable.hard_3_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            {"8",
                    String.valueOf(R.drawable.hard_4_nor_mati),
                    String.valueOf(R.drawable.hard_4_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "XOR"
            },
            {"9",
                    String.valueOf(R.drawable.hard_5_nor_mati),
                    String.valueOf(R.drawable.hard_5_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND"
            },
            {"10",
                    String.valueOf(R.drawable.hard_6_nor_mati),
                    String.valueOf(R.drawable.hard_6_nor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XNOR"
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
