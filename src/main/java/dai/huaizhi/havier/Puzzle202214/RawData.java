package dai.huaizhi.havier.Puzzle202214;

public class RawData {

    private static String[] rockLines;
    RawData(){
        rockLines = INPUT.split("\n");
    }

    public String[] getRockLines() {
        return rockLines;
    }

    private final static String INPUT ="" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "520,82 -> 524,82\n" +
            "496,164 -> 500,164\n" +
            "505,162 -> 509,162\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "526,94 -> 530,94\n" +
            "513,116 -> 517,116\n" +
            "493,162 -> 497,162\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "539,66 -> 544,66\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "517,85 -> 521,85\n" +
            "523,85 -> 527,85\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "499,158 -> 503,158\n" +
            "502,160 -> 506,160\n" +
            "508,164 -> 512,164\n" +
            "526,88 -> 530,88\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "518,66 -> 523,66\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "502,164 -> 506,164\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "524,60 -> 529,60\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "510,113 -> 514,113\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "514,94 -> 518,94\n" +
            "511,91 -> 515,91\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "490,164 -> 494,164\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "523,91 -> 527,91\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "520,57 -> 525,57\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "511,145 -> 511,146 -> 517,146 -> 517,145\n" +
            "521,63 -> 526,63\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "503,39 -> 514,39\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "517,60 -> 522,60\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "528,63 -> 533,63\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "494,133 -> 503,133 -> 503,132\n" +
            "531,60 -> 536,60\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "523,54 -> 528,54\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "517,91 -> 521,91\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "514,63 -> 519,63\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "511,79 -> 511,77 -> 511,79 -> 513,79 -> 513,70 -> 513,79 -> 515,79 -> 515,73 -> 515,79 -> 517,79 -> 517,77 -> 517,79 -> 519,79 -> 519,77 -> 519,79 -> 521,79 -> 521,76 -> 521,79\n" +
            "504,113 -> 508,113\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "501,116 -> 505,116\n" +
            "511,145 -> 511,146 -> 517,146 -> 517,145\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "532,94 -> 536,94\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "499,162 -> 503,162\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "520,94 -> 524,94\n" +
            "491,119 -> 491,120 -> 503,120 -> 503,119\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "491,119 -> 491,120 -> 503,120 -> 503,119\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "529,91 -> 533,91\n" +
            "507,110 -> 511,110\n" +
            "494,133 -> 503,133 -> 503,132\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "511,145 -> 511,146 -> 517,146 -> 517,145\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "491,119 -> 491,120 -> 503,120 -> 503,119\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "496,160 -> 500,160\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "527,57 -> 532,57\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "508,94 -> 512,94\n" +
            "532,66 -> 537,66\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "494,23 -> 494,17 -> 494,23 -> 496,23 -> 496,20 -> 496,23 -> 498,23 -> 498,16 -> 498,23 -> 500,23 -> 500,18 -> 500,23 -> 502,23 -> 502,19 -> 502,23 -> 504,23 -> 504,18 -> 504,23\n" +
            "520,88 -> 524,88\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "514,88 -> 518,88\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "504,107 -> 504,99 -> 504,107 -> 506,107 -> 506,97 -> 506,107 -> 508,107 -> 508,103 -> 508,107\n" +
            "525,66 -> 530,66\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "535,63 -> 540,63\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "511,66 -> 516,66\n" +
            "491,136 -> 491,138 -> 483,138 -> 483,141 -> 499,141 -> 499,138 -> 496,138 -> 496,136\n" +
            "505,123 -> 505,125 -> 501,125 -> 501,130 -> 511,130 -> 511,125 -> 508,125 -> 508,123\n" +
            "514,42 -> 514,46 -> 508,46 -> 508,51 -> 525,51 -> 525,46 -> 517,46 -> 517,42\n" +
            "507,116 -> 511,116\n" +
            "496,36 -> 496,34 -> 496,36 -> 498,36 -> 498,30 -> 498,36 -> 500,36 -> 500,31 -> 500,36 -> 502,36 -> 502,27 -> 502,36 -> 504,36 -> 504,29 -> 504,36 -> 506,36 -> 506,34 -> 506,36 -> 508,36 -> 508,34 -> 508,36 -> 510,36 -> 510,30 -> 510,36 -> 512,36 -> 512,30 -> 512,36\n" +
            "507,149 -> 507,151 -> 502,151 -> 502,155 -> 516,155 -> 516,151 -> 511,151 -> 511,149\n" +
            "282,166 -> 745,166";


}
