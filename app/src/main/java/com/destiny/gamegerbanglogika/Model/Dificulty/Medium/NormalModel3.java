package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel3 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_4_or_mati),
                    String.valueOf(R.drawable.normal_4_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "NAND"
            },
            {"2",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"3",
                    String.valueOf(R.drawable.normal_4_and_mati),
                    String.valueOf(R.drawable.normal_4_and_nyala),
                    "XNOR",
                    "XOR",
                    "OR",
                    "XNOR"
            },
            {"4",
                    String.valueOf(R.drawable.normal_3_nand_mati),
                    String.valueOf(R.drawable.normal_3_nand_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"7",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "NAND",
                    "OR",
                    "XNOR",
                    "XNOR"
            },
            {"8",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "XOR",
                    "XNOR",
                    "NOR",
                    "XNOR"
            },
            {"9",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"10",
                    String.valueOf(R.drawable.normal_2_and_mati),
                    String.valueOf(R.drawable.normal_2_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
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
