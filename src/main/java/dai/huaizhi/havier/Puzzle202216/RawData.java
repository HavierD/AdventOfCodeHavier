package dai.huaizhi.havier.Puzzle202216;

public class RawData {

    public String[] inputs;
    public static int minutes = 30;

    RawData(){
//        inputs = exampleInput.split("\n");
        inputs = INPUT.split("\n");
    }



    private final String exampleInput =
            "Valve AA has flow rate=0; tunnels lead to valves DD, II, BB\n" +
            "Valve BB has flow rate=13; tunnels lead to valves CC, AA\n" +
            "Valve CC has flow rate=2; tunnels lead to valves DD, BB\n" +
            "Valve DD has flow rate=20; tunnels lead to valves CC, AA, EE\n" +
            "Valve EE has flow rate=3; tunnels lead to valves FF, DD\n" +
            "Valve FF has flow rate=0; tunnels lead to valves EE, GG\n" +
            "Valve GG has flow rate=0; tunnels lead to valves FF, HH\n" +
            "Valve HH has flow rate=22; tunnel leads to valve GG\n" +
            "Valve II has flow rate=0; tunnels lead to valves AA, JJ\n" +
            "Valve JJ has flow rate=21; tunnel leads to valve II";



    private final String INPUT =
            "Valve0 QZ has flow rate=0; tunnels lead to valves IR, FA\n" +
            "Valve1 FV has flow rate=0; tunnels lead to valves AA, GZ\n" +
            "Valve2 GZ has flow rate=0; tunnels lead to valves FV, PO\n" +
            "Valve3 QL has flow rate=0; tunnels lead to valves MR, AA\n" +
            "Valve4 AA has flow rate=0; tunnels lead to valves QL, GQ, EV, FV\n" +
            "Valve5 SQ has flow rate=23; tunnel leads to valve ZG\n" +
            "Valve6 PK has flow rate=8; tunnels lead to valves MN, GN, WF, TY, CX\n" +
            "Valve7 GQ has flow rate=0; tunnels lead to valves AA, MT\n" +
            "Valve8 TI has flow rate=22; tunnels lead to valves GM, CS\n" +
            "Valve9 JU has flow rate=17; tunnels lead to valves TT, RR, UJ, JY\n" +
            "Valve10 YD has flow rate=7; tunnels lead to valves AT, ZS, BS\n" +
            "Valve11 YB has flow rate=0; tunnels lead to valves EA, MW\n" +
            "Valve12 FA has flow rate=0; tunnels lead to valves QZ, JT\n" +
            "Valve13 TN has flow rate=0; tunnels lead to valves ZS, PO\n" +
            "Valve14 MW has flow rate=0; tunnels lead to valves YB, YL\n" +
            "Valve15 XN has flow rate=0; tunnels lead to valves VL, VM\n" +
            "Valve16 MN has flow rate=0; tunnels lead to valves PK, TT\n" +
            "Valve17 IP has flow rate=9; tunnels lead to valves YC, SA, CH, PI\n" +
            "Valve18 PD has flow rate=0; tunnels lead to valves YZ, VM\n" +
            "Valve19 ZS has flow rate=0; tunnels lead to valves TN, YD\n" +
            "Valve20 PC has flow rate=0; tunnels lead to valves MR, XT\n" +
            "Valve21 VM has flow rate=13; tunnels lead to valves CX, XN, PD\n" +
            "Valve22 PO has flow rate=4; tunnels lead to valves GZ, TN, SA, XT, BM\n" +
            "Valve23 GN has flow rate=0; tunnels lead to valves PK, YL\n" +
            "Valve24 YL has flow rate=5; tunnels lead to valves MT, YZ, GN, SU, MW\n" +
            "Valve25 IR has flow rate=6; tunnels lead to valves LK, PI, BM, QZ, EV\n" +
            "Valve26 GM has flow rate=0; tunnels lead to valves TI, RH\n" +
            "Valve27 CS has flow rate=0; tunnels lead to valves UJ, TI\n" +
            "Valve28 EA has flow rate=18; tunnels lead to valves VL, YB, WF, JY\n" +
            "Valve29 LK has flow rate=0; tunnels lead to valves IR, MR\n" +
            "Valve30 BM has flow rate=0; tunnels lead to valves IR, PO\n" +
            "Valve31 JZ has flow rate=0; tunnels lead to valves RH, RR\n" +
            "Valve32 SA has flow rate=0; tunnels lead to valves IP, PO\n" +
            "Valve33 XT has flow rate=0; tunnels lead to valves PO, PC\n" +
            "Valve34 YC has flow rate=0; tunnels lead to valves IP, IL\n" +
            "Valve35 RH has flow rate=15; tunnels lead to valves WJ, JZ, GM\n" +
            "Valve36 CH has flow rate=0; tunnels lead to valves IP, BS\n" +
            "Valve37 JY has flow rate=0; tunnels lead to valves EA, JU\n" +
            "Valve38 TY has flow rate=0; tunnels lead to valves WJ, PK\n" +
            "Valve39 WJ has flow rate=0; tunnels lead to valves TY, RH\n" +
            "Valve40 IL has flow rate=0; tunnels lead to valves YC, MR\n" +
            "Valve41 BS has flow rate=0; tunnels lead to valves YD, CH\n" +
            "Valve42 AT has flow rate=0; tunnels lead to valves YD, UX\n" +
            "Valve43 UJ has flow rate=0; tunnels lead to valves CS, JU\n" +
            "Valve44 VL has flow rate=0; tunnels lead to valves EA, XN\n" +
            "Valve45 JT has flow rate=21; tunnels lead to valves ZG, FA\n" +
            "Valve46 UX has flow rate=10; tunnel leads to valve AT\n" +
            "Valve47 RR has flow rate=0; tunnels lead to valves JZ, JU\n" +
            "Valve48 TT has flow rate=0; tunnels lead to valves JU, MN\n" +
            "Valve49 MT has flow rate=0; tunnels lead to valves GQ, YL\n" +
            "Valve50 EV has flow rate=0; tunnels lead to valves AA, IR\n" +
            "Valve51 ZG has flow rate=0; tunnels lead to valves JT, SQ\n" +
            "Valve52 WF has flow rate=0; tunnels lead to valves EA, PK\n" +
            "Valve53 YZ has flow rate=0; tunnels lead to valves PD, YL\n" +
            "Valve54 MR has flow rate=3; tunnels lead to valves LK, IL, QL, SU, PC\n" +
            "Valve55 PI has flow rate=0; tunnels lead to valves IR, IP\n" +
            "Valve56 CX has flow rate=0; tunnels lead to valves VM, PK\n" +
            "Valve57 SU has flow rate=0; tunnels lead to valves YL, MR";


    /**
     * all distances:
     * to : SQ7
     * to : PK5
     * to : TI10
     * to : JU8
     * to : YD6
     * to : IP4
     * to : VM6
     * to : PO3
     * to : YL3
     * to : IR2
     * to : EA6
     * to : RH8
     * to : JT5
     * to : UX8
     * to : MR2
     */











}
