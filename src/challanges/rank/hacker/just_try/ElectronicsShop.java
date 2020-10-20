package challanges.rank.hacker.just_try;

import java.util.ArrayList;
import java.util.List;
// A person wants to determine the most expensive computer keyboard and USB drive
// that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget,
// find the cost to buy them. If it is not possible to buy both items, return -1.
// Example:
// b(budget) = 60
// keyboards = {40,50,60}
// drives = {5,8,12}
// The person can buy a 40$ keyboard + 12$ drive, or a 50$ keyboard and a 8$ drive.
// Choose the latter as the more expensive option and return 58.
// Function Description:
// Complete the getMoneySpent function in the editor below.
// getMoneySpent has the following parameter(s):
//    int keyboards[n]: the keyboard prices
//    int drives[m]: the drive prices
//    int b: the budget
// Returns:
//    int: the maximum that can be spent, or -1
//    if it is not possible to buy both items

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int temporaryValue = 0;
        int temp = -1;
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
                temporaryValue = kb + dr;
                if (temporaryValue <= b && temporaryValue > temp) {
                    temp = temporaryValue;
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
        int[] drives = {135, 443, 1354, 2319, 2882, 3169, 3821, 4365, 5668, 6091, 7844, 8866, 9041, 9927, 12106, 13033,
                14194, 14319, 14697, 16952, 17557, 19121, 19332, 22032, 23358, 23601, 24504, 27526, 29177, 30557, 30797, 30945, 30963,
                31429, 32626, 33677, 34470, 35947, 36027, 37991, 38939, 39005, 39469, 41667, 42302, 43017, 43910, 44172, 44574,
                44922, 46068, 46863, 48197, 49991, 50238, 52211, 52367, 54345, 57661, 57716, 57755, 57858, 58106, 59485, 59730, 60643, 62218,
                62472, 62704, 65710, 66025, 69046, 71792, 72333, 72919, 73099, 75623, 76257, 76403, 76880, 77667, 82735, 85361,
                88222, 88625, 89310, 89833, 90743, 93694, 95421, 99890, 100964, 101827, 101916, 102772, 104428, 104832, 105389, 108918,
                109289, 111003, 111024, 111538, 112958, 116049, 116166, 118530, 119981, 120235, 122949, 124397,
                124849, 125579, 125753, 129630, 129960, 130078, 130682, 131548, 132403, 133859, 134306, 134466,
                136632, 137030, 139148, 139229, 140835, 142883, 142909, 145230, 146996, 147095, 147337, 148018, 148212, 148830,
                150556, 151619, 152363, 152364, 153842, 154180, 158660, 160061, 161708, 162737, 163918, 165280, 165788, 166991,
                168375, 175262, 176136, 177211, 177929, 180349, 181781, 182849, 186065, 187886, 189083, 190151, 191637, 194668,
                195878, 196971, 199261, 200520, 200697, 201358, 203269, 205028, 207142, 207356, 208912, 208930, 209233, 210753,
                211161, 212042, 214006, 214677, 215790, 219167, 219324, 219855, 220796, 220903, 222126, 223314, 224941, 225433, 226080,
                227802, 228287, 228729, 228746, 230303, 232093, 232437, 234707, 235091, 239213, 240437, 240454, 241944, 241948,
                241987, 242032, 242286, 245863, 246660, 246880, 246964, 247397, 251058, 253879, 254289, 256106, 259394, 259601,
                259964, 265643, 266228, 266736, 267313, 267653, 269029, 270309, 270455, 271471, 271609, 274766, 275611, 275830, 276232, 276300,
                278503, 278823, 280398, 281068, 282543, 284339, 285848, 287475, 288471, 288951, 289310, 290036, 290570, 291210, 292581, 293375, 294686, 295358, 295368,
                298120, 298503, 299464, 299634, 299869, 300558, 301985, 302402, 302516, 302984, 303263, 306207, 310070, 311935, 311970, 313277, 313419, 314038, 315219, 315699, 316342, 317659, 321569, 321743, 325897, 330318, 332175, 333483, 337417, 337422,
                340448, 340464, 341860, 341881, 342526, 345270, 347356, 348175, 348900, 353541, 354348, 355122, 356266, 357110,
                357202, 357895, 358660, 358797, 360132, 360316, 362350, 365764, 367817, 367869, 368791, 369897, 370481, 371246, 371808,
                371824, 374889, 375415, 377071, 377399, 377404, 379180, 382667, 385207, 385599, 386411, 386628, 387737, 388075,
                388254, 389570, 391947, 392547, 392883, 394824, 395220, 395227, 395295, 395524, 397738, 397927, 398095, 399191, 401397, 401537, 401870, 402538, 402856, 402965, 404381, 405194, 406766, 407199, 407635, 407677, 413736, 414244, 415698, 415736, 415892, 416216, 416599, 422480, 428799, 432827, 432914, 433916, 435606, 437095, 439249, 440541, 441324, 443556, 444144, 444228, 444466, 445643, 447775, 448421, 449451, 454050, 455022, 456082, 457803, 458099, 458338, 458570, 458627, 458702, 459067, 459769, 461550, 462780, 463278, 464200, 466888, 467074, 468260, 470095, 472389, 473508, 473917, 474114, 475514, 475654, 476075, 476545, 476591, 476951, 477008, 477987, 478368, 480999, 481442, 481658, 483517, 484187, 487738, 487962, 489008, 491529, 492042, 492437, 492976, 493926, 494787, 496808, 497425, 498349, 498684, 499009, 500514, 500717, 500738, 503198, 506072, 507561, 510548, 511245, 511391, 512836, 513018, 514800, 515979, 518078, 519150, 520288, 521414, 521578, 522562, 522658, 522695, 526398, 527345, 527352, 527384, 528698, 529780, 530857, 531058, 532378, 533507, 538935, 541530, 541827, 543147, 543929, 544605, 544951, 545504, 546701, 546983, 547087, 548506, 549105, 549255, 549447, 552115, 552194, 552626, 553837, 554783, 557835, 561001, 561420, 562839, 563416, 564202, 564757, 565112, 565213, 568221, 569506, 569669, 570779, 571938, 573659, 573971, 575486, 577171, 577253, 577410, 578429, 579306, 580599, 582340, 583116, 583389, 583398, 585997, 588865, 591540, 593149, 593620, 593695, 595266, 599256, 602253, 603079, 603201, 603428, 603630, 605892, 606284, 607015, 607890, 613743, 619875, 620801, 621049, 622180, 622484, 622554, 623547, 624925, 626376, 626734, 629700, 631064, 632233, 632687, 632855, 633049, 634483, 634507, 634568, 635587, 636098, 636683, 637235, 640343, 640621, 640760, 642005, 642964, 644295, 644616, 644737, 644978, 646605, 647860, 647964, 651104, 651787, 656779, 657502, 658689, 659263, 662584, 663157, 666536, 666751, 667005, 667017, 671794, 674283, 674501, 675293, 675733, 676000, 676261, 676974, 677540, 677695, 677966, 679704, 679774, 680910, 681903, 682348, 682771, 687175, 687562, 687877, 688200, 690156, 690253, 692689, 697914, 698469, 700192, 702699, 704016, 707136, 707246, 707881, 709174, 709543, 710271, 710296, 711045, 711884, 713207, 713368, 714114, 715200, 718493, 719816, 719954, 720818, 721885, 722306, 722870, 723313, 725020, 725145, 725791, 725880, 729026, 730661, 730983, 732288, 733217, 734196, 734744, 736367, 737263, 738036, 738764, 739194, 740643, 741071, 746029, 747613, 748814, 751942, 753598, 754193, 754435, 754792, 756384, 757481, 759783, 761026, 761180, 761210, 761260, 761970, 762074, 762481, 762769, 763752, 764701, 766289, 767741, 769096, 770332, 770955, 771801, 773096, 773264, 773317, 773714, 774166, 775521, 777104, 780552, 781498, 781525, 782000, 782192, 782565, 783194, 783375, 784598, 785367, 787727, 789111, 790688, 792700, 792774, 793322, 793573, 794390, 794695, 796420, 803664, 804140, 804619, 804935, 806772, 807148, 807338, 808262, 808418, 808458, 809366, 810043, 811307, 816941, 819983, 821618, 822112, 822366, 822721, 823495, 823964, 826894, 826901, 827002, 827706, 828656, 829579, 829951, 830876, 833838, 834333, 835597, 835669, 835669, 838455, 838739, 839528, 840006, 842265, 842421, 842902, 843840, 844439, 846112, 847160, 847252, 847386, 847463, 848234, 850540, 852750, 853978, 854155, 854415, 855400, 857323, 859151, 863596, 863743, 864157, 865773, 866016, 866744, 866966, 867129, 869140, 869960, 870166, 872245, 875709, 877289, 877554, 877845, 879454, 880356, 880514, 882191, 883664, 884624, 888604, 888860, 890342, 890416, 892074, 893292, 894655, 894845, 895929, 896277, 897877, 898764, 899658, 900286, 901587, 902440, 906270, 906316, 906626, 907148, 907405, 908104, 909660, 910149, 911274, 916999, 917693, 918446, 918634, 918942, 919595, 919739, 925846, 926403, 926592, 928870, 929438, 929467, 930381, 930817, 931017, 931098, 936533, 937303, 937590, 940661, 942937, 943197, 943915, 944195, 944255, 947609, 947902, 949060, 949285, 949326, 950674, 950987, 951143, 951645, 953112, 953235, 955063, 955331, 956135, 956263, 956536, 957016, 957664, 958006, 958150, 960352, 960385, 960844, 961352, 962527, 962986, 963717, 964247, 964296, 966266, 966636, 967271, 969827, 970961, 971752, 974414, 974592, 974812, 976234, 977529, 979202, 980330, 980961, 981209, 981365, 981399, 981414, 981875, 984235, 990310, 990432, 990770, 991552, 992666, 993479, 994073, 994873, 995044, 995083, 995206, 996348, 998046, 999692, 999940};
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