package com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class XnorModel1 {
    public static String[][] data = new String[][]{
            //Easy
            {"1",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "XOR",
                    "XNOR",
                    "NOR",
                    "XNOR"
            },
            {"2",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR"
            },
            //Normal
            {"3",
                    String.valueOf(R.drawable.normal_1_xnor_mati),
                    String.valueOf(R.drawable.normal_1_xnor_nyala),
                    "NOR",
                    "XNOR",
                    "XOR",
                    "XNOR"
            },
            {"4",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"5",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "OR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_4_xnor_mati),
                    String.valueOf(R.drawable.normal_4_xnor_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            //Hard
            {"7",
                    String.valueOf(R.drawable.hard_1_xnor_mati),
                    String.valueOf(R.drawable.hard_1_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND"
            },
            {"8",
                    String.valueOf(R.drawable.hard_2_xnor_mati),
                    String.valueOf(R.drawable.hard_2_xnor_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"9",
                    String.valueOf(R.drawable.hard_3_xnor_mati),
                    String.valueOf(R.drawable.hard_3_xnor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_4_xnor_mati),
                    String.valueOf(R.drawable.hard_4_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND"
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
