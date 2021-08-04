package com.destiny.gamegerbanglogika.Model.Kategorikal.NOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NorModel {
    public static String[][] data = new String[][]{
            //Easy
            {"1",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "NOR"
            },
            {"2",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NOR",
                    "XOR",
                    "NOR"
            },
            {"3",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            //Normal
            {"4",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"5",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "NAND",
                    "OR",
                    "XNOR",
                    "XNOR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_3_nor_mati),
                    String.valueOf(R.drawable.normal_3_nor_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR"
            },
            {"7",
                    String.valueOf(R.drawable.normal_4_nor_mati),
                    String.valueOf(R.drawable.normal_4_nor_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "NAND"
            },
            {"8",
                    String.valueOf(R.drawable.normal_5_nor_mati),
                    String.valueOf(R.drawable.normal_5_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            {"9",
                    String.valueOf(R.drawable.normal_6_nor_mati),
                    String.valueOf(R.drawable.normal_6_nor_nyala),
                    "NOR",
                    "XNOR",
                    "OR",
                    "OR"
            },
            //Hard
            {"10",
                    String.valueOf(R.drawable.hard_1_nor_mati),
                    String.valueOf(R.drawable.hard_1_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"11",
                    String.valueOf(R.drawable.hard_2_nor_mati),
                    String.valueOf(R.drawable.hard_2_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR"
            },
            {"12",
                    String.valueOf(R.drawable.hard_3_nor_mati),
                    String.valueOf(R.drawable.hard_3_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            {"13",
                    String.valueOf(R.drawable.hard_4_nor_mati),
                    String.valueOf(R.drawable.hard_4_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "XOR"
            },
            {"14",
                    String.valueOf(R.drawable.hard_5_nor_mati),
                    String.valueOf(R.drawable.hard_5_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND"
            },
            {"15",
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
