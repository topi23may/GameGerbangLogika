package com.destiny.gamegerbanglogika.Model.Kategorikal.NAND;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NandModel4 {
    public static String[][] data = new String[][]{
            {"2",
                    String.valueOf(R.drawable.easy_off_on_mati),
                    String.valueOf(R.drawable.easy_off_on_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND"
            },
            {"1",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NAND",
                    "XOR",
                    "NAND"
            },
            //Normal
            {"3",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
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
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"6",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR"
            },
            //Hard
            {"7",
                    String.valueOf(R.drawable.hard_4_nand_mati),
                    String.valueOf(R.drawable.hard_4_nand_nyala),
                    "OR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"8",
                    String.valueOf(R.drawable.hard_6_nand_mati),
                    String.valueOf(R.drawable.hard_6_nand_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND"
            },
            {"9",
                    String.valueOf(R.drawable.hard_3_nand_mati),
                    String.valueOf(R.drawable.hard_3_nand_nyala),
                    "XNOR",
                    "OR",
                    "NAND",
                    "XNOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_5_nand_mati),
                    String.valueOf(R.drawable.hard_5_nand_nyala),
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
