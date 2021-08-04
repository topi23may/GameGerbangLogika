package com.destiny.gamegerbanglogika.Model.Dificulty.Hard;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class HardModel1 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.hard_1_xor_mati),
                    String.valueOf(R.drawable.hard_1_xor_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND"
            },
            //OR
            {"2",
                    String.valueOf(R.drawable.hard_1_or_mati),
                    String.valueOf(R.drawable.hard_1_or_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND"
            },
            {"3",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR"
            },
            {"4",
                    String.valueOf(R.drawable.hard_6_xnor_mati),
                    String.valueOf(R.drawable.hard_6_xnor_nyala),
                    "AND",
                    "OR",
                    "NOR",
                    "OR"
            },
            {"5",
                    String.valueOf(R.drawable.hard_4_and_mati),
                    String.valueOf(R.drawable.hard_4_and_nyala),
                    "OR",
                    "AND",
                    "XNOR",
                    "XNOR"
            },
            //NAND
            {"6",
                    String.valueOf(R.drawable.hard_2_nand_mati),
                    String.valueOf(R.drawable.hard_2_nand_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"7",
                    String.valueOf(R.drawable.hard_5_nand_mati),
                    String.valueOf(R.drawable.hard_5_nand_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XNOR"
            },
            //NOR
            {"8",
                    String.valueOf(R.drawable.hard_1_nor_mati),
                    String.valueOf(R.drawable.hard_1_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"9",
                    String.valueOf(R.drawable.hard_2_nor_mati),
                    String.valueOf(R.drawable.hard_2_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_3_nor_mati),
                    String.valueOf(R.drawable.hard_3_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
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
