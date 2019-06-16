public class Tests {

    /*
    //checks remove too!
    private static  String[] outTest0 = ("0.5\n" +
            "16\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3933_0.4249\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");


    private static String[] outTest1 = ("0.8\n" +
            "29\n" +
            "0wedjfn3498_3,111111_3,123456_2,123789_3,3hksdbh456_1,42_3,6543ediugntj5k6nyiugfe_3,7777_2,8888_3,9999_3,amqouwerh487r_3,bgushlita_1,burgers4life_3,checkcheck_2,cweiuernfkwe3456y_3,donald_3,dtvnwejnwonrofineof_3,fghj_2,fileonthesurfer_3,genl456udskn_3,google_0,headphones_3,hellow_3,here_3,hibye_2,hpqwdsfkjn3i4u56908djs_3,hwello_3,jndsvkdjdn_2,kasjneuijdsk_3,keyskeyskeyskeys_2,lhjbfnjsjh_3,login_1,mana_3,mnbv_3,morekeys_3,morepasswords_2,morepower_3,moresearchtime_0,ndskjn_3,ntucosdnjk456_3,ojaskfn4i6534eni_2,password_3,poiu_2,pppppppppppp_3,querty_1,rtyu_3,sadkjfne_3,slash_2,speakers_3,starwars_1,swoije3489hnzosdfnb_3,t0dfoinvrt0nierjkdfv_3,useadblockpls_2,vvvvvvvvvvvvvv_3,welcome_2,zinuerknhesfd_3,zxcvbnm_3,zzzzzzzzzzzzz_3\n" +
            "0.3725_0.5054\n" +
            "0wedjfn3498_3,111111_3,123456_2,123789_3,3hksdbh456_1,42_3,6543ediugntj5k6nyiugfe_3,7777_2,8888_3,9999_3,amqouwerh487r_3,bgushlita_1,burgers4life_3,checkcheck_2,cweiuernfkwe3456y_3,donald_3,dtvnwejnwonrofineof_3,fghj_2,fileonthesurfer_3,genl456udskn_0,google_3,headphones_2,here_3,hibye_2,hpqwdsfkjn3i4u56908djs_3,hwello_3,jndsvkdjdn_1,kasjneuijdsk_3,keyskeyskeyskeys_2,lhjbfnjsjh_3,login_1,mana_3,mnbv_3,morekeys_3,morepasswords_2,morepower_3,moresearchtime_0,ndskjn_3,ntucosdnjk456_3,ojaskfn4i6534eni_2,password_3,poiu_3,pppppppppppp_3,pppppppppppp_1,rtyu_3,sadkjfne_3,slash_2,speakers_3,starwars_1,swoije3489hnzosdfnb_3,t0dfoinvrt0nierjkdfv_3,useadblockpls_2,vvvvvvvvvvvvvv_3,welcome_2,zinuerknhesfd_3,zxcvbnm_3,zzzzzzzzzzzzz_3")
            .split("\n");

    private static String[] outTest2 = ("0.0\n" +
            "11\n" +
            "111111_2,123456_2,123789_2,42_1,7777_2,8888_2,9999_2,bgushlita_1,burgers4life_2,checkcheck_2,donald_0,filreonthesurfer_2,google_2,headphones_2,hellow_1,hibye_2,hwello_2,login_1,morepasswordsssssss_2,password_2,querty_2,speakers_2,starwars_1,welcome_2,zxcvbnm_2\n" +
            "0.3782_0.6410\n" +
            "111111_2,123456_2,123789_2,42_1,7777_2,8888_2,9999_2,bgushlita_1,burgers4life_2,checkcheck_2,donald_0,filreonthesurfer_2,google_2,headphones_1,hibye_2,hwello_2,login_1,morepasswordsssssss_2,password_2,speakers_2,starwars_1,welcome_2,zxcvbnm_2")
            .split("\n");

    private static String[] outTest3 = ("0.5238095238095238\n" +
            "24\n" +
            "0gldqc_2,111111_2,123456_2,123789_2,42_1,72stusakjn_2,7777_2,8888_2,9999_2,allgood_2,bgushlita_1,burgers4life_2,checkcheck_2,djnvkdnvk_2,dkjfnkvn8934h5itrnfk_2,donald_0,dtvsiiii_2,eldjkjfsadfgd_2,erkgjkjssgdfgsg_2,fghj_2,gazilionpasswords_2,genl9u_1,gojirashlita_2,google_2,headphones_2,hellow_1,hibye_2,hkjnmkjh_2,hugedbofpasswords_2,hwello_1,jndkvnfjlsmcslirlemdovfdjrmgfbv_2,jnvkd_2,kay_2,kdjnksnkjniu34567tf_1,kejdgdkdlnasflrnfv_2,kerofhsdkfjsdfdsfsdfdgfdgsd_2,keyskeyskeyskeys_0,kwdjfbfkdjvnd_2,lalalala_2,lalnfldfmsi_2,login_1,lsdjhfgds_2,mana_2,miomdsvoindoin_2,mmmm_2,mnbv_2,morekeys_1,morepasswords_2,moresearchtime_2,ndskdnjkdnsk_1,notfinishedyet_2,ntuc453465jkd_2,nvkdnknsjk43_2,orepower_0,password_2,poiu_2,pppppppppppp_2,pwqisdjkne_2,querty_1,rtyu_2,sadkje56tg_2,sdfnkjd_2,slash_1,somethingsomething_2,speakers_2,starwars_1,trekjnskdrk_2,vvvvvvvvvvvvvv_2,wehavemore_2,welcome_2,woisnfdsdfun_1,zxcvbnm_2,zzzzzzzzzzzzz_2\n" +
            "0.3872_0.4565\n" +
            "0gldqc_2,111111_2,123456_2,123789_2,42_1,72stusakjn_2,7777_2,8888_2,9999_2,allgood_2,bgushlita_1,burgers4life_2,checkcheck_2,djnvkdnvk_2,dkjfnkvn8934h5itrnfk_2,donald_0,dtvsiiii_2,eldjkjfsadfgd_2,erkgjkjssgdfgsg_2,fghj_2,gazilionpasswords_2,genl9u_1,gojirashlita_2,google_2,headphones_1,hibye_2,hkjnmkjh_2,hugedbofpasswords_2,hwello_1,jndkvnfjlsmcslirlemdovfdjrmgfbv_2,jnvkd_2,kay_2,kdjnksnkjniu34567tf_1,kejdgdkdlnasflrnfv_2,kerofhsdkfjsdfdsfsdfdgfdgsd_2,keyskeyskeyskeys_0,kwdjfbfkdjvnd_2,lalalala_2,lalnfldfmsi_2,login_1,lsdjhfgds_2,mana_2,miomdsvoindoin_2,mmmm_2,mnbv_2,morekeys_1,morepasswords_2,moresearchtime_2,ndskdnjkdnsk_1,notfinishedyet_2,ntuc453465jkd_2,nvkdnknsjk43_2,orepower_0,password_2,poiu_2,pppppppppppp_2,pwqisdjkne_1,rtyu_2,sadkje56tg_2,sdfnkjd_2,slash_1,somethingsomething_2,speakers_2,starwars_1,trekjnskdrk_2,vvvvvvvvvvvvvv_2,wehavemore_2,welcome_2,woisnfdsdfun_1,zxcvbnm_2,zzzzzzzzzzzzz_2")
            .split("\n");

    private static String[] outTest4 = ("0.25\n" +
            "11\n"+
            "111111_1,123456_0,bigvalues_1,donald_1,google_0,hellow_1,littlevalues_0,smallvalues_1,whitevalues_1\n"+
            "0.3978_0.4782\n"+
            "111111_1,123456_0,bigvalues_1,donald_0,google_1,littlevalues_0,smallvalues_1,whitevalues_1").split("\n");

    private static String[] outTest5 = ("0.0\n" +
            "4\n" +
            "111111_4,123456_3,123789_4,14253656854567_4,34567ijhg456765456765_2,42_4,42432424242424242_4,7777_3,8888_4,9999_2,aaabbnnnmmhg_4,allgood_3,apildskvme_4,asdfgfs_4,asdfkjgfdnedwertyujhgfgdrtgf_4,bgushlita_1,burgers4life_4,checkcheck_3,cvfghjujhnbsdfoidjgodjpoerjpgjofmoidneognfjknodmergffdwggh_4,cvfghyuijhnb_3,dclmkvdlmkdvlmkvdlmkdoirdpjfgonidfnokdfndfonkdfnoldgnokgf_4,dioferjfmdkcodijfkldmcod_4,donald_2,drtyhjmnbvcxdsrtyuj_4,eitjgtrofgljreoigjroigrjgo_3,eldjkjfsadfgd_4,eofinsdoivndovdnodnvdofivndfoongnodkjergposdfonivkjwf_4,eorijoire_3,erfrniourefneifneofenfoenoien_4,erkgjkjssgdfgsg_2,erlifrenrogneroignergonerof_4,erofindodngodfngdfkgnoifneoifrenfoirenoierngoierngoirengre_3,erognerofnreofiernfoinfoirenfoienfeiofninfoeneifneofniewofinwe_4,ertyhujnbvdftghjbfiodrjltkhgfdpeorjlktgfjoirtg_4,ertyjhnbvc_3,ertyuikjmnbvcdfrtyujn_4,et4t_4,fghj_3,fireonthesurfer_4,gojirashlita_4,google_0,headphones_4,hellow_4,hibye_3,hugedbofpasswords_4,hwello_4,kejdgdkdlnasflrnfv_2,kerofhsdkfjsdfdsfsdfdgfdgsd_4,keyskeyskeyskeys_3,khfnuinkjerdsc_4,kwdjfbfkdjvnd_3,lidfkjvmcpiwds_4,lifsdkjewnowink_4,login_2,lsdjhfgds_4,mana_4,mnbv_3,morekeys_4,morepasswords_1,morepower_4,moresearchtime_3,morestuff_4,notfinishedyet_2,oeridgjlfkqw0eorujfkdsjierouihgfnkvd_4,oerignonerf_4,oidflkmsewregf_3,orekndlpmdgr_4,oweifneroignowkerifdgndiungdieoifeoinovndfoivnfoivndfoindonviodfnvodifnvd_4,oweihdflgkfertgjiofdklm_2,password_4,poiu_3,pppppppppppp_4,querty_1,qwertyuijnbfrtyuhjnbvftyhjnb_4,regunerofewnoierg_4,rtyu_4,sdldknjeifnk_3,sdvbnvcsdefrgthgbv_4,slash_4,soidgoiwefoiergmr_4,somethingdb_3,speakers_4,starwars_2,useadblockpls_4,vvvvvvvvvvvvvv_3,wefnrkgnewifuerngiurngeionwoewnoirenre_4,wehavemore_4,welcome_3,weoirgfdmsioergfbmklderjiofd_4,wer765trg_4,wertyujhnbvd_4,writinggazilionpasswords_2,wwkndsjewkjn_4,zxcvbnm_3,zzzzzzzzzzzzz_4\n" +
            "0.3312_0.4345\n" +
            "111111_4,123456_3,123789_4,14253656854567_4,34567ijhg456765456765_2,42_4,42432424242424242_4,7777_3,8888_4,9999_2,aaabbnnnmmhg_4,allgood_3,apildskvme_4,asdfgfs_4,asdfkjgfdnedwertyujhgfgdrtgf_4,bgushlita_1,burgers4life_4,checkcheck_3,cvfghjujhnbsdfoidjgodjpoerjpgjofmoidneognfjknodmergffdwggh_4,cvfghyuijhnb_3,dclmkvdlmkdvlmkvdlmkdoirdpjfgonidfnokdfndfonkdfnoldgnokgf_4,dioferjfmdkcodijfkldmcod_4,donald_2,drtyhjmnbvcxdsrtyuj_4,eitjgtrofgljreoigjroigrjgo_3,eldjkjfsadfgd_4,eofinsdoivndovdnodnvdofivndfoongnodkjergposdfonivkjwf_4,eorijoire_3,erfrniourefneifneofenfoenoien_4,erkgjkjssgdfgsg_2,erlifrenrogneroignergonerof_4,erofindodngodfngdfkgnoifneoifrenfoirenoierngoierngoirengre_3,erognerofnreofiernfoinfoirenfoienfeiofninfoeneifneofniewofinwe_4,ertyhujnbvdftghjbfiodrjltkhgfdpeorjlktgfjoirtg_4,ertyjhnbvc_3,ertyuikjmnbvcdfrtyujn_4,et4t_4,fghj_3,fireonthesurfer_4,gojirashlita_4,google_0,headphones_4,hibye_3,hugedbofpasswords_4,hwello_4,kejdgdkdlnasflrnfv_4,kerofhsdkfjsdfdsfsdfdgfdgsd_2,keyskeyskeyskeys_4,khfnuinkjerdsc_4,kwdjfbfkdjvnd_3,lidfkjvmcpiwds_4,lifsdkjewnowink_4,login_2,lsdjhfgds_4,mana_4,mnbv_3,morekeys_4,morepasswords_1,morepower_4,moresearchtime_3,morestuff_4,notfinishedyet_2,oeridgjlfkqw0eorujfkdsjierouihgfnkvd_4,oerignonerf_4,oidflkmsewregf_3,orekndlpmdgr_4,oweifneroignowkerifdgndiungdieoifeoinovndfoivnfoivndfoindonviodfnvodifnvd_4,oweihdflgkfertgjiofdklm_3,password_4,poiu_3,pppppppppppp_4,pppppppppppp_1,qwertyuijnbfrtyuhjnbvftyhjnb_4,regunerofewnoierg_4,rtyu_4,sdldknjeifnk_3,sdvbnvcsdefrgthgbv_4,slash_4,soidgoiwefoiergmr_4,somethingdb_3,speakers_4,starwars_2,useadblockpls_4,vvvvvvvvvvvvvv_3,wefnrkgnewifuerngiurngeionwoewnoirenre_4,wehavemore_4,welcome_3,weoirgfdmsioergfbmklderjiofd_4,wer765trg_4,wertyujhnbvd_4,writinggazilionpasswords_2,wwkndsjewkjn_4,zxcvbnm_3,zzzzzzzzzzzzz_4")
            .split("\n");

    private static String[] outTest6 = ("0.5714285714285714\n" +
            "6\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,hellow_1,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_1,pass6_0,pass7_1,pass8_1,pass9_1,password_1,querty_1,starwars_1,welcome_1,zxcvbnm_1\n" +
            "0.2947_0.5566\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_0,pass6_1,pass7_1,pass8_1,pass9_1,password_1,starwars_1,welcome_1,zxcvbnm_1")
            .split("\n");

    //delete test too!
    private static String[] outTest7 = ("0.6\n" +
            "17\n" +
            "111111_2,123456_1,badpass_2,deleteme_2,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3264_0.5186\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    private static String[] outTest8 = ("0.2\n" +
            "4\n" +
            "111111_1,123456_1,donald_0,google_1,hellow_1,login_1,password_1,querty_1\n" +
            "0.3267_0.5225\n" +
            "111111_1,123456_1,donald_0,google_1,login_1,password_1")
            .split("\n");

    private static String[] outTest9 = ("0.0\n" +
            "1\n" +
            "111111_1,123456_1,donald_1,google_0,hellow_1,login_1,password_1,querty_1,somepasswords_1,something_1\n" +
            "0.3683_0.5138\n" +
            "111111_1,123456_1,donald_1,google_0,login_1,password_1,somepasswords_1,something_1").split("\n");

    private static String[] outTest10 = ("0.4\n" +
            "5\n" +
            "111111_1,123456_1,donald_1,google_0,hellow_1,login_1,password_1,querty_0,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1\n" +
            "0.2983_0.5033\n" +
            "111111_1,123456_1,donald_1,google_0,login_1,password_1,smore_1,smores_0,somemore_1,somepasswords_1,yummy_1").split("\n");

    public static String[] outTest11 = ("0.3333333333333333\n" +
            "6\n" +
            "111111_1,123456_1,camels_1,cats_1,dogs_1,donald_1,google_1,hellow_0,login_1,parrots_1,password_1,querty_1,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1\n" +
            "0.3050_0.4427\n" +
            "111111_1,123456_1,camels_1,cats_1,dogs_1,donald_1,google_0,login_1,parrots_1,password_1,smore_1,smores_1,somemore_1,somepasswords_1,yummy_1")
            .split("\n");

    public static String[] outTest12 = ("0.0\n" +
            "0\n" +
            "justme_0\n" +
            "0.3167_0.3701\n" +
            "justme_0").split("\n");

    public static String[] outTest13 = ("0.0\n" +
            "1\n" +
            "disney_0,justme_0\n" +
            "0.2637_0.4144\n" +
            "disney_0,justme_0").split("\n");

    public static String[] outTest14 = ("0.0\n" +
            "1\n" +
            "anotherone_0,disney_0,justme_0\n" +
            "0.2607_0.4544\n" +
            "anotherone_0,disney_0,justme_0").split("\n");

    public static String[] outTest15 = ("0.5\n" +
            "16\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3933_0.4249\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    public static final String testsLoc = "C:\\DSchecking\\Tests";

    public static final String[] testsDirName = {"Tst0", "Tst1", "Tst2", "Tst3", "Tst4", "Tst5", "Tst6", "Tst7",
            "Tst8", "Tst9", "Tst10", "Tst11", "Tst12", "Tst13", "Tst14", "Tst15"};

    public static final String[][] tests = {outTest0, outTest1, outTest2, outTest3, outTest4, outTest5, outTest6, outTest7,
            outTest8, outTest9, outTest10, outTest11, outTest12, outTest13, outTest14, outTest15};

    public static String[] params = {"32 2 2", "100 4 2", "300 5 3", "200 5 3", "25 2 2", "200 5 2", "40 4 9", "32 2 2",
            "29 3 3", "40 4 4", "50 3 4", "45 5 5", "32 2 2", "32 2 2", "32 2 2", "32 2 2", "32 2 2"};

     */

    //new Tst1 is Tst15 (no delete check)
    //new Tst2 is Tst0 (with delete check)
    //new Tst3 is Tst6 (no delete check)
    //new Tst4 is Tst12 (no delete check)

    public static final String[] outTest1 = ("0.5\n" +
            "16\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3933_0.4249\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    //checks remove too
    public static final String[] outTest2 = ("0.5\n" +
            "16\n" +
            "111111_2,123456_1,donald_2,google_0,hellow_2,login_1,password_2,querty_1,starwars_2,welcome_2,zxcvbnm_2\n" +
            "0.3933_0.4249\n" +
            "111111_1,123456_0,donald_1,google_0,login_1,password_0,starwars_1,welcome_1,zxcvbnm_1").split("\n");

    public static final String[] outTest3 = ("0.5714285714285714\n" +
            "6\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,hellow_1,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_1,pass6_0,pass7_1,pass8_1,pass9_1,password_1,querty_1,starwars_1,welcome_1,zxcvbnm_1\n" +
            "0.2947_0.5566\n" +
            "111111_1,123456_1,42_1,9999_1,bgushlita_1,burgers4life_1,checkcheck_1,donald_1,google_0,login_1,morepasswords_1,pass10_1,pass11_1,pass12_1,pass2_1,pass3_1,pass4_1,pass5_0,pass6_1,pass7_1,pass8_1,pass9_1,password_1,starwars_1,welcome_1,zxcvbnm_1")
            .split("\n");

    public static final String[] outTest4 = ("0.0\n" +
            "0\n" +
            "justme_0\n" +
            "0.3167_0.3701\n" +
            "justme_0").split("\n");

    public static final String testsLoc = "C:\\DSchecking\\Tests";

    public static final String[][] tests = {outTest1, outTest2, outTest3, outTest4};


    public static final String[] testsDirName = {"Tst1", "Tst2", "Tst3", "Tst4"};

    public static final String[] params = {"32 2 2", "32 2 2", "40 4 9", "32 2 2"};
}
