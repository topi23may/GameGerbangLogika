package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel1 {
        public static String[][] data = new String[][]{
                {"1",
                        String.valueOf(R.drawable.normal_1_2_xor_mati),
                        String.valueOf(R.drawable.normal_1_2_xor_nyala),
                        "NOR",
                        "NAND",
                        "OR",
                        "OR"
                },
                {"2",
                        String.valueOf(R.drawable.normal_1_and_mati),
                        String.valueOf(R.drawable.normal_1_and_nyala),
                        "NAND",
                        "XNOR",
                        "AND",
                        "NAND"
                },
                {"3",
                        String.valueOf(R.drawable.normal_6_xnor_mati),
                        String.valueOf(R.drawable.normal_6_xnor_nyala),
                        "NAND",
                        "XNOR",
                        "OR",
                        "OR"
                },
                {"4",
                        String.valueOf(R.drawable.normal_3_and_mati),
                        String.valueOf(R.drawable.normal_3_and_nyala),
                        "XNOR",
                        "NOR",
                        "OR",
                        "OR"
                },
                //or
                {"5",
                        String.valueOf(R.drawable.normal_1_2_or_mati),
                        String.valueOf(R.drawable.normal_1_2_or_nyala),
                        "XOR",
                        "XNOR",
                        "NAND",
                        "XNOR"
                },
                {"6",
                        String.valueOf(R.drawable.normal_5_6_nand_mati),
                        String.valueOf(R.drawable.normal_5_6_nand_nyala),
                        "XOR",
                        "AND",
                        "NAND",
                        "AND"
                },
                {"7",
                        String.valueOf(R.drawable.normal_1_2_nor_mati),
                        String.valueOf(R.drawable.normal_1_2_nor_nyala),
                        "XOR",
                        "AND",
                        "NAND",
                        "AND"
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
                        String.valueOf(R.drawable.normal_6_nor_mati),
                        String.valueOf(R.drawable.normal_6_nor_nyala),
                        "NOR",
                        "XNOR",
                        "OR",
                        "OR"
                },

                {"10",
                        String.valueOf(R.drawable.normal_5_xnor_mati),
                        String.valueOf(R.drawable.normal_5_xnor_nyala),
                        "OR",
                        "XNOR",
                        "NAND",
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
