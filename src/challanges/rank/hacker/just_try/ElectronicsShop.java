package challanges.rank.hacker.just_try;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int temporaryValue = 0;
        int temp = 0;
        List<Integer> keyboardList = new ArrayList<>();
        List<Integer> drivesList = new ArrayList<>();

        for (int key : keyboards) {
            keyboardList.add(key);
        }
        for (int drive : drives) {
            drivesList.add(drive);
        }
        for (int kb : keyboardList) {
            for (int dr : drivesList) {
                if (kb + dr <= b) {
                    temporaryValue = kb + dr;
                    if (temporaryValue > temp) {
                        temp = temporaryValue;
                    }
                } else {
                    temp = -1;
                }
            }
        }
        System.out.println("temp: " + temp);
        return temp;
    }


    public static void main(String[] args) {
        int b = 142627;
        int[] keyboards = {762079, 345956, 946858, 154495, 339846, 25454, 517356, 645968, 378996, 637046, 6712, 340681, 385962, 71729, 791899, 409722, 596124,
                311288, 101283, 677274, 847331, 605916, 531205, 364676, 841913, 217942, 580353, 988259, 559815, 454104, 105283, 688430,
                167398, 140585, 972245, 485700, 228539, 27543, 977673, 505569, 532033, 964235, 135820, 384294, 99325};
        int[] drives = {39005, 208912, 30963, 925846, 388075, 414244, 160061, 395524, 23358, 313277, 756384, 147095, 458627, 487962, 289310, 130078,
                900286, 835669, 116166, 370481, 956135, 374889, 314038, 474114, 888604, 444228, 603079, 995083, 826894, 545504, 984235, 88222, 288471,
                607015, 961352, 151619, 389570, 30945, 385599, 970961, 340464, 773714, 541530, 980330, 154180, 477987, 553837, 532378, 541827,
                168375, 762074, 246964, 833838, 838739, 440541, 356266, 302402, 827002, 259394, 709174, 194668, 177211, 57661, 507561, 342526, 677540, 270309,
                235091, 966636, 830876, 557835, 544951, 347356, 165280, 580599, 583116, 139229, 999940, 444144, 150556, 626376, 816941, 489008,
                207356, 401870, 782565, 994073, 734744, 880514, 300558, 623547, 325897, 569506, 792700, 620801, 461550, 201358, 730983, 395227,
                148018, 39469};
        getMoneySpent(keyboards, drives, b);
    }


}
//        int b = 142627;
//        int[] keyboards = {762079, 345956, 946858, 154495, 339846, 25454, 517356, 645968, 378996, 637046, 6712, 340681, 385962, 71729, 791899, 409722, 596124,
//                311288, 101283, 677274, 847331, 605916, 531205, 364676, 841913, 217942, 580353, 988259, 559815, 454104, 105283, 688430,
//                167398, 140585, 972245, 485700, 228539, 27543, 977673, 505569, 532033, 964235, 135820, 384294, 99325};
//        int[] drives = {39005, 208912, 30963, 925846, 388075, 414244, 160061, 395524, 23358, 313277, 756384, 147095, 458627, 487962, 289310, 130078,
//                900286, 835669, 116166, 370481, 956135, 374889, 314038, 474114, 888604, 444228, 603079, 995083, 826894, 545504, 984235, 88222, 288471,
//                607015, 961352, 151619, 389570, 30945, 385599, 970961, 340464, 773714, 541530, 980330, 154180, 477987, 553837, 532378, 541827,
//                168375, 762074, 246964, 833838, 838739, 440541, 356266, 302402, 827002, 259394, 709174, 194668, 177211, 57661, 507561,342526, 677540, 270309,
//                235091, 966636, 830876, 557835, 544951, 347356, 165280, 580599, 583116, 139229, 999940, 444144, 150556, 626376, 816941, 489008,
//                207356, 401870, 782565, 994073, 734744, 880514, 300558, 623547, 325897, 569506, 792700, 620801, 461550, 201358, 730983, 395227,
//                148018, 39469 };