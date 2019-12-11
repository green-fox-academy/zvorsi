public class removeDoubleChar {
    public static void main(String[] args) {

        String readString = "TThhee  ZZeenn  ooff  PPyytthhoonn\n" +
                "bbyy  TTiimm  PPeetteerrss\n" +
                "\n" +
                "BBeeaauuttiiffuull  iiss  bbeetttteerr  tthhaann  uuggllyy..\n" +
                "EExxpplliicciitt  iiss  bbeetttteerr  tthhaann  iimmpplliicciitt..\n" +
                "SSiimmppllee  iiss  bbeetttteerr  tthhaann  ccoommpplleexx..\n" +
                "CCoommpplleexx  iiss  bbeetttteerr  tthhaann  ccoommpplliiccaatteedd..\n" +
                "FFllaatt  iiss  bbeetttteerr  tthhaann  nneesstteedd..\n" +
                "SSppaarrssee  iiss  bbeetttteerr  tthhaann  ddeennssee..\n" +
                "RReeaaddaabbiilliittyy  ccoouunnttss..\n" +
                "SSppeecciiaall  ccaasseess  aarreenn''tt  ssppeecciiaall  eennoouugghh  ttoo  bbrreeaakk  tthhee  rruulleess..\n" +
                "AAlltthhoouugghh  pprraaccttiiccaalliittyy  bbeeaattss  ppuurriittyy..\n" +
                "EErrrroorrss  sshhoouulldd  nneevveerr  ppaassss  ssiilleennttllyy..\n" +
                "UUnnlleessss  eexxpplliicciittllyy  ssiilleenncceedd..\n" +
                "IInn  tthhee  ffaaccee  ooff  aammbbiigguuiittyy,,  rreeffuussee  tthhee  tteemmppttaattiioonn  ttoo  gguueessss..\n" +
                "TThheerree  sshhoouulldd  bbee  oonnee----  aanndd  pprreeffeerraabbllyy  oonnllyy  oonnee  ----oobbvviioouuss  wwaayy  ttoo  ddoo  iitt..\n" +
                "AAlltthhoouugghh  tthhaatt  wwaayy  mmaayy  nnoott  bbee  oobbvviioouuss  aatt  ffiirrsstt  uunnlleessss  yyoouu''rree  DDuuttcchh..\n" +
                "NNooww  iiss  bbeetttteerr  tthhaann  nneevveerr..\n" +
                "AAlltthhoouugghh  nneevveerr  iiss  oofftteenn  bbeetttteerr  tthhaann  **rriigghhtt**  nnooww..\n" +
                "IIff  tthhee  iimmpplleemmeennttaattiioonn  iiss  hhaarrdd  ttoo  eexxppllaaiinn,,  iitt''ss  aa  bbaadd  iiddeeaa..\n" +
                "IIff  tthhee  iimmpplleemmeennttaattiioonn  iiss  eeaassyy  ttoo  eexxppllaaiinn,,  iitt  mmaayy  bbee  aa  ggoooodd  iiddeeaa..\n" +
                "NNaammeessppaacceess  aarree  oonnee  hhoonnkkiinngg  ggrreeaatt  iiddeeaa  ----  lleett''ss  ddoo  mmoorree  ooff  tthhoossee!!";

        replacedouble(readString);
    }

    private static void replacedouble(String readString) {
        String outCome = readString.charAt(0) + "";
        int count = 0;
        char[] cA = readString.toCharArray();
        for (int i = 0; i + 1 < cA.length; ++i) {
            if (readString.charAt(i) != readString.charAt(i + 1)) {
                outCome += readString.charAt(i + 1);
            }
        }
        String replaced = outCome.replace("beter", "better");
        System.out.println(replaced);
    }
}
