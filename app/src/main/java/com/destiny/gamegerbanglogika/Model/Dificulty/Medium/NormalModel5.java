package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel5 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_3_nand_mati),
                    String.valueOf(R.drawable.normal_3_nand_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"2",
                    String.valueOf(R.drawable.normal_5_or_mati),
                    String.valueOf(R.drawable.normal_5_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"3",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "NAND",
                    "OR",
                    "XNOR",
                    "XNOR"
            },
            {"4",
                    String.valueOf(R.drawable.normal_6_or_mati),
                    String.valueOf(R.drawable.normal_6_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR"
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_xor_mati),
                    String.valueOf(R.drawable.normal_4_xor_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND"
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
                    String.valueOf(R.drawable.normal_5_xor_mati),
                    String.valueOf(R.drawable.normal_5_xor_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"8",
                    String.valueOf(R.drawable.normal_1_xnor_mati),
                    String.valueOf(R.drawable.normal_1_xnor_nyala),
                    "NOR",
                    "XNOR",
                    "XOR",
                    "XNOR"
            },
            {"9",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR"
            },
            {"10",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
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
