public class Tests {

    private static  String[] outTest0 = ("0.3\n"+
            "14\n"+
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n"+
            "0.4654_0.5026\n"+
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    private static String[] outTest1 = ("0.8\n" +
            "29\n" +
            "0wedjfn3498_4,111111_4,123456_3,123789_4,3hksdbh456_2,42_4,6543ediugntj5k6nyiugfe_4,7777_3,8888_4,9999_4,amqouwerh487r_4,bgushlita_2,burgers4life_4,checkcheck_3,donald_4,bgushlita_1,fghj_4,fileonthesurfer_4,headphones_3,hellow_4,here_4,hibye_2,hwello_4,hibye_3,keyskeyskeyskeys_4,morepasswords_4,password_4,bgushlita_0,cweiuernfkwe3456y_4,dtvnwejnwonrofineof_3,genl456udskn_4,hpqwdsfkjn3i4u56908djs_4,jndsvkdjdn_4,kasjneuijdsk_3,lhjbfnjsjh_4,mnbv_2,morepower_4,mnbv_3,poiu_4,rtyu_4,speakers_4,login_1,mana_4,morekeys_3,ndskjn_4,ojaskfn4i6534eni_4,pppppppppppp_3,sadkjfne_4,login_2,ntucosdnjk456_4,useadblockpls_4,slash_3,vvvvvvvvvvvvvv_4,zinuerknhesfd_4,slash_3,swoije3489hnzosdfnb_4,t0dfoinvrt0nierjkdfv_4,zzzzzzzzzzzzz_4\n" +
            "1.8450_1.1229\n" +
            "0wedjfn3498_3,111111_3,123456_2,123789_3,3hksdbh456_1,42_3,6543ediugntj5k6nyiugfe_3,7777_2,8888_3,9999_3,amqouwerh487r_3,bgushlita_1,burgers4life_3,checkcheck_2,donald_3,bgushlita_0,fghj_3,fileonthesurfer_3,headphones_2,hellow_3,here_3,hibye_1,hwello_3,hibye_2,keyskeyskeyskeys_3,morepasswords_3,password_3,bgushlita_1,cweiuernfkwe3456y_3,dtvnwejnwonrofineof_2,genl456udskn_3,hpqwdsfkjn3i4u56908djs_3,jndsvkdjdn_2,kasjneuijdsk_3,lhjbfnjsjh_1,morepower_3,mnbv_2,poiu_3,rtyu_3,speakers_3,mnbv_0,mana_3,morekeys_3,ndskjn_2,ojaskfn4i6534eni_3,pppppppppppp_2,sadkjfne_3,login_1,login_3,ntucosdnjk456_3,useadblockpls_3,slash_2,vvvvvvvvvvvvvv_3,zinuerknhesfd_3,slash_2,swoije3489hnzosdfnb_3,t0dfoinvrt0nierjkdfv_3,zzzzzzzzzzzzz_3")
            .split("\n");

    private static String[] outTest2 = ("0.0\n" +
            "6\n" +
            "111111_1,123456_1,123789_1,42_0,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,42_0,donald_1,google_1,hellow_1,donald_0,filreonthesurfer_1,headphones_1,hwello_1,morepasswordsssssss_1,password_1,querty_0,speakers_1,starwars_1,zxcvbnm_1\n" +
            "0.3077_0.4867\n" +
            "111111_1,123456_1,123789_1,42_0,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,42_0,donald_1,google_1,hellow_1,donald_0,filreonthesurfer_1,headphones_1,hwello_1,morepasswordsssssss_1,password_0,speakers_1,starwars_1,zxcvbnm_1")
            .split("\n");

    private static String[] outTest3 = ("0.14285714285714285\n" +
            "16\n" +
            "111111_2,123456_2,42_2,checkcheck_2,donald_1,google_2,hellow_2,donald_1,fghj_2,hibye_2,keyskeyskeyskeys_2,lalnfldfmsi_2,mana_0,miomdsvoindoin_2,mmmm_2,morekeys_2,password_2,pppppppppppp_2,querty_1,rtyu_2,speakers_2,querty_1,slash_2,welcome_2,zxcvbnm_2\n" +
            "0.3438_0.4110\n" +
            "111111_1,123456_1,42_1,checkcheck_1,donald_0,google_1,hellow_1,donald_0,fghj_1,hibye_1,keyskeyskeyskeys_1,lalnfldfmsi_1,mana_0,miomdsvoindoin_1,mmmm_1,morekeys_1,password_1,pppppppppppp_0,rtyu_1,speakers_1,querty_0,slash_1,welcome_1,zxcvbnm_1")
            .split("\n");

    private static String[] outTest4 = ("0.28\n" +
            "11\n" +
            "111111_1,123456_0,bigvalues_1,donald_1,google_0,hellow_1,littlevalues_0,smallvalues_1,whitevalues_1\n" +
            "0.6450_0.3698\n" +
            "111111_1,123456_0,bigvalues_1,donald_0,google_1,littlevalues_0,smallvalues_1,whitevalues_1").split("\n");

    private static String[] outTest5 = ("0.5\n" +
            "4\n" +
            "111111_4,123456_3,123789_4,14253656854567_4,34567ijhg456765456765_2,42_4,42432424242424242_4,7777_3,8888_4,9999_2,aaabbnnnmmhg_4,allgood_3,apildskvme_4,asdfgfs_4,asdfkjgfdnedwertyujhgfgdrtgf_4,bgushlita_1,burgers4life_4,checkcheck_3,cvfghjujhnbsdfoidjgodjpoerjpgjofmoidneognfjknodmergffdwggh_4,cvfghyuijhnb_3,dclmkvdlmkdvlmkvdlmkdoirdpjfgonidfnokdfndfonkdfnoldgnokgf_4,dioferjfmdkcodijfkldmcod_4,donald_2,drtyhjmnbvcxdsrtyuj_4,eitjgtrofgljreoigjroigrjgo_3,eldjkjfsadfgd_4,donald_1,eofinsdoivndovdnodnvdofivndfoongnodkjergposdfonivkjwf_4,eorijoire_4,erfrniourefneifneofenfoenoien_4,erlifrenrogneroignergonerof_3,erofindodngodfngdfkgnoifneoifrenfoirenoierngoierngoirengre_4,erognerofnreofiernfoinfoirenfoienfeiofninfoeneifneofniewofinwe_4,ertyhujnbvdftghjbfiodrjltkhgfdpeorjlktgfjoirtg_4,ertyjhnbvc_2,ertyuikjmnbvcdfrtyujn_4,et4t_4,ertyjhnbvc_3,fireonthesurfer_4,gojirashlita_4,google_0,hellow_4,login_3,morepasswords_4,password_4,google_2,headphones_4,hibye_4,hwello_3,somethingdb_4,speakers_4,google_1,hugedbofpasswords_4,kejdgdkdlnasflrnfv_4,kerofhsdkfjsdfdsfsdfdgfdgsd_4,keyskeyskeyskeys_3,khfnuinkjerdsc_4,kwdjfbfkdjvnd_4,lidfkjvmcpiwds_4,lifsdkjewnowink_2,lsdjhfgds_4,mana_4,lifsdkjewnowink_3,morekeys_4,morepower_4,google_0,poiu_4,useadblockpls_4,moresearchtime_3,pppppppppppp_4,rtyu_4,moresearchtime_2,morestuff_4,notfinishedyet_3,oeridgjlfkqw0eorujfkdsjierouihgfnkvd_4,oerignonerf_4,oidflkmsewregf_3,orekndlpmdgr_4,oweifneroignowkerifdgndiungdieoifeoinovndfoivnfoivndfoindonviodfnvodifnvd_4,oweihdflgkfertgjiofdklm_1,qwertyuijnbfrtyuhjnbvftyhjnb_4,regunerofewnoierg_4,sdldknjeifnk_3,sdvbnvcsdefrgthgbv_4,soidgoiwefoiergmr_4,sdldknjeifnk_3,wefnrkgnewifuerngiurngeionwoewnoirenre_4,wehavemore_4,weoirgfdmsioergfbmklderjiofd_4,wer765trg_2,writinggazilionpasswords_4,wwkndsjewkjn_4,wer765trg_3,wertyujhnbvd_4,zzzzzzzzzzzzz_4\n" +
            "1.0386_0.8902\n" +
            "111111_4,123456_3,123789_4,14253656854567_4,34567ijhg456765456765_2,42_4,42432424242424242_4,7777_3,8888_4,9999_2,aaabbnnnmmhg_4,allgood_3,apildskvme_4,asdfgfs_4,asdfkjgfdnedwertyujhgfgdrtgf_4,bgushlita_1,burgers4life_4,checkcheck_3,cvfghjujhnbsdfoidjgodjpoerjpgjofmoidneognfjknodmergffdwggh_4,cvfghyuijhnb_3,dclmkvdlmkdvlmkvdlmkdoirdpjfgonidfnokdfndfonkdfnoldgnokgf_4,dioferjfmdkcodijfkldmcod_4,donald_2,drtyhjmnbvcxdsrtyuj_4,eitjgtrofgljreoigjroigrjgo_3,eldjkjfsadfgd_4,donald_1,eofinsdoivndovdnodnvdofivndfoongnodkjergposdfonivkjwf_4,eorijoire_4,erfrniourefneifneofenfoenoien_4,erlifrenrogneroignergonerof_3,erofindodngodfngdfkgnoifneoifrenfoirenoierngoierngoirengre_4,erognerofnreofiernfoinfoirenfoienfeiofninfoeneifneofniewofinwe_4,ertyhujnbvdftghjbfiodrjltkhgfdpeorjlktgfjoirtg_4,ertyjhnbvc_2,ertyuikjmnbvcdfrtyujn_4,et4t_4,ertyjhnbvc_3,fireonthesurfer_4,gojirashlita_4,google_0,hellow_4,login_3,morepasswords_4,password_4,google_2,headphones_4,hibye_4,hwello_3,somethingdb_4,speakers_4,google_1,hugedbofpasswords_4,kejdgdkdlnasflrnfv_4,kerofhsdkfjsdfdsfsdfdgfdgsd_4,keyskeyskeyskeys_3,khfnuinkjerdsc_4,kwdjfbfkdjvnd_4,lidfkjvmcpiwds_4,lifsdkjewnowink_2,lsdjhfgds_4,mana_4,lifsdkjewnowink_3,morekeys_4,morepower_4,google_1,poiu_4,useadblockpls_4,moresearchtime_3,moresearchtime_4,pppppppppppp_4,rtyu_4,moresearchtime_2,morestuff_4,oeridgjlfkqw0eorujfkdsjierouihgfnkvd_3,oerignonerf_4,oidflkmsewregf_3,orekndlpmdgr_4,oweifneroignowkerifdgndiungdieoifeoinovndfoivnfoivndfoindonviodfnvodifnvd_4,oweihdflgkfertgjiofdklm_2,qwertyuijnbfrtyuhjnbvftyhjnb_4,regunerofewnoierg_4,sdldknjeifnk_3,sdvbnvcsdefrgthgbv_4,soidgoiwefoiergmr_4,sdldknjeifnk_3,wefnrkgnewifuerngiurngeionwoewnoirenre_4,wehavemore_4,weoirgfdmsioergfbmklderjiofd_4,wer765trg_2,writinggazilionpasswords_4,wwkndsjewkjn_4,wer765trg_3,wertyujhnbvd_4,zzzzzzzzzzzzz_4")
            .split("\n");

    private static String[] outTest6 = ("0.5714285714285714\n" +
            "6\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,hellow_1,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_1,pass6_0,pass7_1,pass8_1,pass9_1,password_1,querty_1,starwars_1,welcome_1,zxcvbnm_1\n" +
            "0.3014_0.6292\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_0,pass6_1,pass7_1,pass8_1,pass9_1,password_1,starwars_1,welcome_1,zxcvbnm_1")
            .split("\n");

    //delete test too!
    private static String[] outTest7 = ("0.3\n" +
            "14\n" +
            "111111_2,123456_1,badpass_2,deleteme_2,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3989_0.3350\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    private static String[] outTest8 = ("0.2\n" +
            "4\n" +
            "111111_1,123456_1,donald_0,google_1,hellow_1,login_1,password_1,querty_1\n" +
            "0.3035_0.4391\n" +
            "111111_1,123456_1,donald_0,google_1,login_1,password_1")
            .split("\n");

    private static String[] outTest9 = ("0.0\n" +
            "1\n" +
            "111111_1,123456_1,donald_1,google_0,hellow_1,login_1,password_1,querty_1,somepasswords_1,something_1\n" +
            "0.3439_0.3056\n" +
            "111111_1,123456_1,donald_1,google_0,login_1,password_1,somepasswords_1,something_1").split("\n");

    private static String[] outTest10 = ("0.4\n" +
            "5\n" +
            "111111_1,123456_1,donald_1,google_0,hellow_1,login_1,password_1,querty_0,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1\n" +
            "0.5412_0.3568\n" +
            "111111_1,123456_1,donald_1,google_0,login_1,password_1,smore_1,smores_0,somemore_1,somepasswords_1,yummy_1").split("\n");

    public static String[] outTest11 = ("0.3333333333333333\n" +
            "6\n" +
            "111111_1,123456_1,camels_1,cats_1,dogs_1,donald_1,google_1,hellow_0,login_1,parrots_1,password_1,querty_1,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1\n" +
            "0.3535_0.3230\n" +
            "111111_1,123456_1,camels_1,cats_1,dogs_1,donald_1,google_0,login_1,parrots_1,password_1,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1")
            .split("\n");

    public static final String testsLoc = "C:\\DSchecking\\Tests";

    public static final String[] testsDirName = {"Tst0", "Tst1", "Tst2", "Tst3", "Tst4", "Tst5", "Tst6", "Tst7",
            "Tst8", "Tst9", "Tst10", "Tst11"};

    public static final String[][] tests = {outTest0, outTest1, outTest2, outTest3, outTest4, outTest5, outTest6, outTest7,
            outTest8, outTest9, outTest10, outTest11};

    public static String[] params = {"32 2 2", "100 4 2", "300 5 3", "200 5 3", "25 2 2", "200 5 2", "40 4 9", "32 2 2",
            "29 3 3", "40 4 4", "50 3 4", "45 5 5"};
}
