package com.assignment.CurrencyConverter.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeResponse{
    private Rates rates;

    @Getter
    @Setter
    public class Rates{
        @JsonProperty("AED")
        private double aED;
        @JsonProperty("AFN")
        private double aFN;
        @JsonProperty("ALL")
        private double aLL;
        @JsonProperty("AMD")
        private double aMD;
        @JsonProperty("ANG")
        private double aNG;
        @JsonProperty("AOA")
        private double aOA;
        @JsonProperty("ARS")
        private double aRS;
        @JsonProperty("AUD")
        private double aUD;
        @JsonProperty("AWG")
        private double aWG;
        @JsonProperty("AZN")
        private double aZN;
        @JsonProperty("BAM")
        private double bAM;
        @JsonProperty("BBD")
        private int bBD;
        @JsonProperty("BDT")
        private double bDT;
        @JsonProperty("BGN")
        private double bGN;
        @JsonProperty("BHD")
        private double bHD;
        @JsonProperty("BIF")
        private double bIF;
        @JsonProperty("BMD")
        private int bMD;
        @JsonProperty("BND")
        private double bND;
        @JsonProperty("BOB")
        private double bOB;
        @JsonProperty("BRL")
        private double bRL;
        @JsonProperty("BSD")
        private int bSD;
        @JsonProperty("BTC")
        private double bTC;
        @JsonProperty("BTN")
        private double bTN;
        @JsonProperty("BWP")
        private double bWP;
        @JsonProperty("BYN")
        private double bYN;
        @JsonProperty("BZD")
        private double bZD;
        @JsonProperty("CAD")
        private double cAD;
        @JsonProperty("CDF")
        private double cDF;
        @JsonProperty("CHF")
        private double cHF;
        @JsonProperty("CLF")
        private double cLF;
        @JsonProperty("CLP")
        private double cLP;
        @JsonProperty("CNH")
        private double cNH;
        @JsonProperty("CNY")
        private double cNY;
        @JsonProperty("COP")
        private double cOP;
        @JsonProperty("CRC")
        private double cRC;
        @JsonProperty("CUC")
        private int cUC;
        @JsonProperty("CUP")
        private double cUP;
        @JsonProperty("CVE")
        private double cVE;
        @JsonProperty("CZK")
        private double cZK;
        @JsonProperty("DJF")
        private double dJF;
        @JsonProperty("DKK")
        private double dKK;
        @JsonProperty("DOP")
        private double dOP;
        @JsonProperty("DZD")
        private double dZD;
        @JsonProperty("EGP")
        private double eGP;
        @JsonProperty("ERN")
        private int eRN;
        @JsonProperty("ETB")
        private double eTB;
        @JsonProperty("EUR")
        private double EUR;
        @JsonProperty("FJD")
        private double fJD;
        @JsonProperty("FKP")
        private double fKP;
        @JsonProperty("GBP")
        private double gBP;
        @JsonProperty("GEL")
        private double gEL;
        @JsonProperty("GGP")
        private double gGP;
        @JsonProperty("GHS")
        private double gHS;
        @JsonProperty("GIP")
        private double gIP;
        @JsonProperty("GMD")
        private double gMD;
        @JsonProperty("GNF")
        private double gNF;
        @JsonProperty("GTQ")
        private double gTQ;
        @JsonProperty("GYD")
        private double gYD;
        @JsonProperty("HKD")
        private double hKD;
        @JsonProperty("HNL")
        private double hNL;
        @JsonProperty("HRK")
        private double hRK;
        @JsonProperty("HTG")
        private double hTG;
        @JsonProperty("HUF")
        private double hUF;
        @JsonProperty("IDR")
        private double iDR;
        @JsonProperty("ILS")
        private double iLS;
        @JsonProperty("IMP")
        private double iMP;
        @JsonProperty("INR")
        private double iNR;
        @JsonProperty("IQD")
        private double iQD;
        @JsonProperty("IRR")
        private int iRR;
        @JsonProperty("ISK")
        private double iSK;
        @JsonProperty("JEP")
        private double jEP;
        @JsonProperty("JMD")
        private double jMD;
        @JsonProperty("JOD")
        private double jOD;
        @JsonProperty("JPY")
        private double jPY;
        @JsonProperty("KES")
        private double kES;
        @JsonProperty("KGS")
        private double kGS;
        @JsonProperty("KHR")
        private double kHR;
        @JsonProperty("KMF")
        private double kMF;
        @JsonProperty("KPW")
        private int kPW;
        @JsonProperty("KRW")
        private double kRW;
        @JsonProperty("KWD")
        private double kWD;
        @JsonProperty("KYD")
        private double kYD;
        @JsonProperty("KZT")
        private double kZT;
        @JsonProperty("LAK")
        private double lAK;
        @JsonProperty("LBP")
        private double lBP;
        @JsonProperty("LKR")
        private double lKR;
        @JsonProperty("LRD")
        private double lRD;
        @JsonProperty("LSL")
        private double lSL;
        @JsonProperty("LYD")
        private double lYD;
        @JsonProperty("MAD")
        private double mAD;
        @JsonProperty("MDL")
        private double mDL;
        @JsonProperty("MGA")
        private double mGA;
        @JsonProperty("MKD")
        private double mKD;
        @JsonProperty("MMK")
        private int mMK;
        @JsonProperty("MNT")
        private int mNT;
        @JsonProperty("MOP")
        private double mOP;
        @JsonProperty("MRU")
        private double mRU;
        @JsonProperty("MUR")
        private double mUR;
        @JsonProperty("MVR")
        private double mVR;
        @JsonProperty("MWK")
        private double mWK;
        @JsonProperty("MXN")
        private double mXN;
        @JsonProperty("MYR")
        private double mYR;
        @JsonProperty("MZN")
        private double mZN;
        @JsonProperty("NAD")
        private double nAD;
        @JsonProperty("NGN")
        private double nGN;
        @JsonProperty("NIO")
        private double nIO;
        @JsonProperty("NOK")
        private double nOK;
        @JsonProperty("NPR")
        private double nPR;
        @JsonProperty("NZD")
        private double nZD;
        @JsonProperty("OMR")
        private double oMR;
        @JsonProperty("PAB")
        private int pAB;
        @JsonProperty("PEN")
        private double pEN;
        @JsonProperty("PGK")
        private double pGK;
        @JsonProperty("PHP")
        private double pHP;
        @JsonProperty("PKR")
        private double pKR;
        @JsonProperty("PLN")
        private double pLN;
        @JsonProperty("PYG")
        private double pYG;
        @JsonProperty("QAR")
        private double qAR;
        @JsonProperty("RON")
        private double rON;
        @JsonProperty("RSD")
        private double rSD;
        @JsonProperty("RUB")
        private double rUB;
        @JsonProperty("RWF")
        private double rWF;
        @JsonProperty("SAR")
        private double sAR;
        @JsonProperty("SBD")
        private double sBD;
        @JsonProperty("SCR")
        private double sCR;
        @JsonProperty("SDG")
        private int sDG;
        @JsonProperty("SEK")
        private double sEK;
        @JsonProperty("SGD")
        private double sGD;
        @JsonProperty("SHP")
        private double sHP;
        @JsonProperty("SLL")
        private double sLL;
        @JsonProperty("SOS")
        private double sOS;
        @JsonProperty("SRD")
        private double sRD;
        @JsonProperty("SSP")
        private double sSP;
        @JsonProperty("STD")
        private double sTD;
        @JsonProperty("STN")
        private double sTN;
        @JsonProperty("SVC")
        private double sVC;
        @JsonProperty("SYP")
        private int sYP;
        @JsonProperty("SZL")
        private double sZL;
        @JsonProperty("THB")
        private double tHB;
        @JsonProperty("TJS")
        private double tJS;
        @JsonProperty("TMT")
        private double tMT;
        @JsonProperty("TND")
        private double tND;
        @JsonProperty("TOP")
        private double tOP;
        @JsonProperty("TRY")
        private double tRY;
        @JsonProperty("TTD")
        private double tTD;
        @JsonProperty("TWD")
        private double tWD;
        @JsonProperty("TZS")
        private double tZS;
        @JsonProperty("UAH")
        private double uAH;
        @JsonProperty("UGX")
        private double uGX;
        @JsonProperty("USD")
        private double USD;
        @JsonProperty("UYU")
        private double uYU;
        @JsonProperty("UZS")
        private double uZS;
        @JsonProperty("VES")
        private double vES;
        @JsonProperty("VND")
        private double vND;
        @JsonProperty("VUV")
        private double vUV;
        @JsonProperty("WST")
        private double wST;
        @JsonProperty("XAF")
        private double xAF;
        @JsonProperty("XAG")
        private double xAG;
        @JsonProperty("XAU")
        private double xAU;
        @JsonProperty("XCD")
        private double xCD;
        @JsonProperty("XDR")
        private double xDR;
        @JsonProperty("XOF")
        private double xOF;
        @JsonProperty("XPD")
        private double xPD;
        @JsonProperty("XPF")
        private double xPF;
        @JsonProperty("XPT")
        private double xPT;
        @JsonProperty("YER")
        private double yER;
        @JsonProperty("ZAR")
        private double zAR;
        @JsonProperty("ZMW")
        private double zMW;
        @JsonProperty("ZWL")
        private int zWL;
    }
}




