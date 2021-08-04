package com.destiny.gamegerbanglogika.Model.Dificulty.Hard;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class HardModel3 {
    public static String[][] data = new String[][]{
            //OR

            {"1",
                    String.valueOf(R.drawable.hard_6_or_mati),
                    String.valueOf(R.drawable.hard_6_or_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },

            {"2",
                    String.valueOf(R.drawable.hard_6_xnor_mati),
                    String.valueOf(R.drawable.hard_6_xnor_nyala),
                    "AND",
                    "OR",
                    "NOR",
                    "OR"
            },
            {"3",
                    String.valueOf(R.drawable.hard_4_nand_mati),
                    String.valueOf(R.drawable.hard_4_nand_nyala),
                    "OR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"4",
                    String.valueOf(R.drawable.hard_1_nand_mati),
                    String.valueOf(R.drawable.hard_1_nand_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR"
            },
            //AND
            {"5",
                    String.valueOf(R.drawable.hard_1_and_mati),
                    String.valueOf(R.drawable.hard_1_and_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"6",
                    String.valueOf(R.drawable.hard_2_and_mati),
                    String.valueOf(R.drawable.hard_2_and_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND"
            },
            {"7",
                    String.valueOf(R.drawable.hard_1_or_mati),
                    String.valueOf(R.drawable.hard_1_or_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND"
            },
            {"8",
                    String.valueOf(R.drawable.hard_3_and_mati),
                    String.valueOf(R.drawable.hard_3_and_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND"
            },
            {"9",
                    String.valueOf(R.drawable.hard_4_and_mati),
                    String.valueOf(R.drawable.hard_4_and_nyala),
                    "OR",
                    "AND",
                    "XNOR",
                    "XNOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR"
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
