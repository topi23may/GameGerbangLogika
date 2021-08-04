package com.destiny.gamegerbanglogika.Model.Dificulty.Hard;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class HardModel2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.hard_5_nand_mati),
                    String.valueOf(R.drawable.hard_5_nand_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XNOR"
            },
            //OR
            {"2",
                    String.valueOf(R.drawable.hard_3_nand_mati),
                    String.valueOf(R.drawable.hard_3_nand_nyala),
                    "XNOR",
                    "OR",
                    "NAND",
                    "XNOR"
            },
            {"3",
                    String.valueOf(R.drawable.hard_3_xor_mati),
                    String.valueOf(R.drawable.hard_3_xor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "XOR"
            },
            {"4",
                    String.valueOf(R.drawable.hard_3_or_mati),
                    String.valueOf(R.drawable.hard_3_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND"
            },
            {"5",
                    String.valueOf(R.drawable.hard_6_or_mati),
                    String.valueOf(R.drawable.hard_6_or_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"6",
                    String.valueOf(R.drawable.hard_1_xor_mati),
                    String.valueOf(R.drawable.hard_1_xor_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND"
            },
            //AND
            {"7",
                    String.valueOf(R.drawable.hard_1_and_mati),
                    String.valueOf(R.drawable.hard_1_and_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"8",
                    String.valueOf(R.drawable.hard_5_xnor_mati),
                    String.valueOf(R.drawable.hard_5_xnor_nyala),
                    "OR",
                    "XNOR",
                    "AND",
                    "OR"
            },
            {"9",
                    String.valueOf(R.drawable.hard_5_and_mati),
                    String.valueOf(R.drawable.hard_5_and_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_6_and_mati),
                    String.valueOf(R.drawable.hard_6_and_nyala),
                    "NOR",
                    "OR",
                    "XNOR",
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
