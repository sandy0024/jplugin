package net.jplugin.ext.staticweb.impl;

import java.util.HashMap;

public class ContentTypeMaps {
	static HashMap<String, String> hm = new HashMap<String, String>();
	private static int maxKenLen;
	public static String get(String ext){
		return hm.get(ext);
	}
	
	static {
		hm.put(".tif", "image/tiff");
		hm.put(".301", "application/x-301");
		hm.put(".323", "text/h323");
		hm.put(".906", "application/x-906");
		hm.put(".907", "drawing/907");
		hm.put(".a11", "application/x-a11");
		hm.put(".acp", "audio/x-mei-aac");
		hm.put(".ai", "application/postscript");
		hm.put(".aif", "audio/aiff");
		hm.put(".aifc", "audio/aiff");
		hm.put(".aiff", "audio/aiff");
		hm.put(".anv", "application/x-anv");
		hm.put(".asa", "text/asa");
		hm.put(".asf", "video/x-ms-asf");
		hm.put(".asp", "text/asp");
		hm.put(".asx", "video/x-ms-asf");
		hm.put(".au", "audio/basic");
		hm.put(".avi", "video/avi");
		hm.put(".awf", "application/vnd.adobe.workflow");
		hm.put(".biz", "text/xml");
		hm.put(".bmp", "application/x-bmp");
		hm.put(".bot", "application/x-bot");
		hm.put(".c4t", "application/x-c4t");
		hm.put(".c90", "application/x-c90");
		hm.put(".cal", "application/x-cals");
		hm.put(".cat", "application/vnd.ms-pki.seccat");
		hm.put(".cdf", "application/x-netcdf");
		hm.put(".cdr", "application/x-cdr");
		hm.put(".cel", "application/x-cel");
		hm.put(".cer", "application/x-x509-ca-cert");
		hm.put(".cg4", "application/x-g4");
		hm.put(".cgm", "application/x-cgm");
		hm.put(".cit", "application/x-cit");
		hm.put(".class", "java/*");
		hm.put(".cml", "text/xml");
		hm.put(".cmp", "application/x-cmp");
		hm.put(".cmx", "application/x-cmx");
		hm.put(".cot", "application/x-cot");
		hm.put(".crl", "application/pkix-crl");
		hm.put(".crt", "application/x-x509-ca-cert");
		hm.put(".csi", "application/x-csi");
		hm.put(".css", "text/css");
		hm.put(".cut", "application/x-cut");
		hm.put(".dbf", "application/x-dbf");
		hm.put(".dbm", "application/x-dbm");
		hm.put(".dbx", "application/x-dbx");
		hm.put(".dcd", "text/xml");
		hm.put(".dcx", "application/x-dcx");
		hm.put(".der", "application/x-x509-ca-cert");
		hm.put(".dgn", "application/x-dgn");
		hm.put(".dib", "application/x-dib");
		hm.put(".dll", "application/x-msdownload");
		hm.put(".doc", "application/msword");
		hm.put(".dot", "application/msword");
		hm.put(".drw", "application/x-drw");
		hm.put(".dtd", "text/xml");
		hm.put(".dwf", "Model/vnd.dwf");
		hm.put(".dwf", "application/x-dwf");
		hm.put(".dwg", "application/x-dwg");
		hm.put(".dxb", "application/x-dxb");
		hm.put(".dxf", "application/x-dxf");
		hm.put(".edn", "application/vnd.adobe.edn");
		hm.put(".emf", "application/x-emf");
		hm.put(".eml", "message/rfc822");
		hm.put(".ent", "text/xml");
		hm.put(".epi", "application/x-epi");
		hm.put(".eps", "application/x-ps");
		hm.put(".eps", "application/postscript");
		hm.put(".etd", "application/x-ebx");
		hm.put(".exe", "application/x-msdownload");
		hm.put(".fax", "image/fax");
		hm.put(".fdf", "application/vnd.fdf");
		hm.put(".fif", "application/fractals");
		hm.put(".fo", "text/xml");
		hm.put(".frm", "application/x-frm");
		hm.put(".g4", "application/x-g4");
		hm.put(".gbr", "application/x-gbr");
		hm.put(".gif", "image/gif");
		hm.put(".gl2", "application/x-gl2");
		hm.put(".gp4", "application/x-gp4");
		hm.put(".hgl", "application/x-hgl");
		hm.put(".hmr", "application/x-hmr");
		hm.put(".hpg", "application/x-hpgl");
		hm.put(".hpl", "application/x-hpl");
		hm.put(".hqx", "application/mac-binhex40");
		hm.put(".hrf", "application/x-hrf");
		hm.put(".hta", "application/hta");
		hm.put(".htc", "text/x-component");
		hm.put(".htm", "text/html");
		hm.put(".html", "text/html");
		hm.put(".htt", "text/webviewhtml");
		hm.put(".htx", "text/html");
		hm.put(".icb", "application/x-icb");
		hm.put(".ico", "image/x-icon");
		hm.put(".ico", "application/x-ico");
		hm.put(".iff", "application/x-iff");
		hm.put(".ig4", "application/x-g4");
		hm.put(".igs", "application/x-igs");
		hm.put(".iii", "application/x-iphone");
		hm.put(".img", "application/x-img");
		hm.put(".ins", "application/x-internet-signup");
		hm.put(".isp", "application/x-internet-signup");
		hm.put(".IVF", "video/x-ivf");
		hm.put(".java", "java/*");
		hm.put(".jfif", "image/jpeg");
		hm.put(".jpe", "image/jpeg");
		hm.put(".jpe", "application/x-jpe");
		hm.put(".jpeg", "image/jpeg");
		hm.put(".jpg", "image/jpeg");
		hm.put(".jpg", "application/x-jpg");
		hm.put(".js", "application/x-javascript");
		hm.put(".jsp", "text/html");
		hm.put(".la1", "audio/x-liquid-file");
		hm.put(".lar", "application/x-laplayer-reg");
		hm.put(".latex", "application/x-latex");
		hm.put(".lavs", "audio/x-liquid-secure");
		hm.put(".lbm", "application/x-lbm");
		hm.put(".lmsff", "audio/x-la-lms");
		hm.put(".ls", "application/x-javascript");
		hm.put(".ltr", "application/x-ltr");
		hm.put(".m1v", "video/x-mpeg");
		hm.put(".m2v", "video/x-mpeg");
		hm.put(".m3u", "audio/mpegurl");
		hm.put(".m4e", "video/mpeg4");
		hm.put(".mac", "application/x-mac");
		hm.put(".man", "application/x-troff-man");
		hm.put(".math", "text/xml");
		hm.put(".mdb", "application/msaccess");
		hm.put(".mdb", "application/x-mdb");
		hm.put(".mfp", "application/x-shockwave-flash");
		hm.put(".mht", "message/rfc822");
		hm.put(".mhtml", "message/rfc822");
		hm.put(".mi", "application/x-mi");
		hm.put(".mid", "audio/mid");
		hm.put(".midi", "audio/mid");
		hm.put(".mil", "application/x-mil");
		hm.put(".mml", "text/xml");
		hm.put(".mnd", "audio/x-musicnet-download");
		hm.put(".mns", "audio/x-musicnet-stream");
		hm.put(".mocha", "application/x-javascript");
		hm.put(".movie", "video/x-sgi-movie");
		hm.put(".mp1", "audio/mp1");
		hm.put(".mp2", "audio/mp2");
		hm.put(".mp2v", "video/mpeg");
		hm.put(".mp3", "audio/mp3");
		hm.put(".mp4", "video/mpeg4");
		hm.put(".mpa", "video/x-mpg");
		hm.put(".mpd", "application/vnd.ms-project");
		hm.put(".mpe", "video/x-mpeg");
		hm.put(".mpeg", "video/mpg");
		hm.put(".mpg", "video/mpg");
		hm.put(".mpga", "audio/rn-mpeg");
		hm.put(".mpp", "application/vnd.ms-project");
		hm.put(".mps", "video/x-mpeg");
		hm.put(".mpt", "application/vnd.ms-project");
		hm.put(".mpv", "video/mpg");
		hm.put(".mpv2", "video/mpeg");
		hm.put(".mpw", "application/vnd.ms-project");
		hm.put(".mpx", "application/vnd.ms-project");
		hm.put(".mtx", "text/xml");
		hm.put(".mxp", "application/x-mmxp");
		hm.put(".net", "image/pnetvue");
		hm.put(".nrf", "application/x-nrf");
		hm.put(".nws", "message/rfc822");
		hm.put(".odc", "text/x-ms-odc");
		hm.put(".out", "application/x-out");
		hm.put(".p10", "application/pkcs10");
		hm.put(".p12", "application/x-pkcs12");
		hm.put(".p7b", "application/x-pkcs7-certificates");
		hm.put(".p7c", "application/pkcs7-mime");
		hm.put(".p7m", "application/pkcs7-mime");
		hm.put(".p7r", "application/x-pkcs7-certreqresp");
		hm.put(".p7s", "application/pkcs7-signature");
		hm.put(".pc5", "application/x-pc5");
		hm.put(".pci", "application/x-pci");
		hm.put(".pcl", "application/x-pcl");
		hm.put(".pcx", "application/x-pcx");
		hm.put(".pdf", "application/pdf");
		hm.put(".pdf", "application/pdf");
		hm.put(".pdx", "application/vnd.adobe.pdx");
		hm.put(".pfx", "application/x-pkcs12");
		hm.put(".pgl", "application/x-pgl");
		hm.put(".pic", "application/x-pic");
		hm.put(".pko", "application/vnd.ms-pki.pko");
		hm.put(".pl", "application/x-perl");
		hm.put(".plg", "text/html");
		hm.put(".pls", "audio/scpls");
		hm.put(".plt", "application/x-plt");
		hm.put(".png", "image/png");
		hm.put(".png", "application/x-png");
		hm.put(".pot", "application/vnd.ms-powerpoint");
		hm.put(".ppa", "application/vnd.ms-powerpoint");
		hm.put(".ppm", "application/x-ppm");
		hm.put(".pps", "application/vnd.ms-powerpoint");
		hm.put(".ppt", "application/vnd.ms-powerpoint");
		hm.put(".ppt", "application/x-ppt");
		hm.put(".pr", "application/x-pr");
		hm.put(".prf", "application/pics-rules");
		hm.put(".prn", "application/x-prn");
		hm.put(".prt", "application/x-prt");
		hm.put(".ps", "application/x-ps");
		hm.put(".ps", "application/postscript");
		hm.put(".ptn", "application/x-ptn");
		hm.put(".pwz", "application/vnd.ms-powerpoint");
		hm.put(".r3t", "text/vnd.rn-realtext3d");
		hm.put(".ra", "audio/vnd.rn-realaudio");
		hm.put(".ram", "audio/x-pn-realaudio");
		hm.put(".ras", "application/x-ras");
		hm.put(".rat", "application/rat-file");
		hm.put(".rdf", "text/xml");
		hm.put(".rec", "application/vnd.rn-recording");
		hm.put(".red", "application/x-red");
		hm.put(".rgb", "application/x-rgb");
		hm.put(".rjs", "application/vnd.rn-realsystem-rjs");
		hm.put(".rjt", "application/vnd.rn-realsystem-rjt");
		hm.put(".rlc", "application/x-rlc");
		hm.put(".rle", "application/x-rle");
		hm.put(".rm", "application/vnd.rn-realmedia");
		hm.put(".rmf", "application/vnd.adobe.rmf");
		hm.put(".rmi", "audio/mid");
		hm.put(".rmj", "application/vnd.rn-realsystem-rmj");
		hm.put(".rmm", "audio/x-pn-realaudio");
		hm.put(".rmp", "application/vnd.rn-rn_music_package");
		hm.put(".rms", "application/vnd.rn-realmedia-secure");
		hm.put(".rmvb", "application/vnd.rn-realmedia-vbr");
		hm.put(".rmx", "application/vnd.rn-realsystem-rmx");
		hm.put(".rnx", "application/vnd.rn-realplayer");
		hm.put(".rp", "image/vnd.rn-realpix");
		hm.put(".rpm", "audio/x-pn-realaudio-plugin");
		hm.put(".rsml", "application/vnd.rn-rsml");
		hm.put(".rt", "text/vnd.rn-realtext");
		hm.put(".rtf", "application/msword");
		hm.put(".rtf", "application/x-rtf");
		hm.put(".rv", "video/vnd.rn-realvideo");
		hm.put(".sam", "application/x-sam");
		hm.put(".sat", "application/x-sat");
		hm.put(".sdp", "application/sdp");
		hm.put(".sdw", "application/x-sdw");
		hm.put(".sit", "application/x-stuffit");
		hm.put(".slb", "application/x-slb");
		hm.put(".sld", "application/x-sld");
		hm.put(".slk", "drawing/x-slk");
		hm.put(".smi", "application/smil");
		hm.put(".smil", "application/smil");
		hm.put(".smk", "application/x-smk");
		hm.put(".snd", "audio/basic");
		hm.put(".sol", "text/plain");
		hm.put(".sor", "text/plain");
		hm.put(".spc", "application/x-pkcs7-certificates");
		hm.put(".spl", "application/futuresplash");
		hm.put(".spp", "text/xml");
		hm.put(".ssm", "application/streamingmedia");
		hm.put(".sst", "application/vnd.ms-pki.certstore");
		hm.put(".stl", "application/vnd.ms-pki.stl");
		hm.put(".stm", "text/html");
		hm.put(".sty", "application/x-sty");
		hm.put(".svg", "text/xml");
		hm.put(".swf", "application/x-shockwave-flash");
		hm.put(".tdf", "application/x-tdf");
		hm.put(".tg4", "application/x-tg4");
		hm.put(".tga", "application/x-tga");
		hm.put(".tif", "image/tiff");
		hm.put(".tif", "application/x-tif");
		hm.put(".tiff", "image/tiff");
		hm.put(".tld", "text/xml");
		hm.put(".top", "drawing/x-top");
		hm.put(".torrent", "application/x-bittorrent");
		hm.put(".tsd", "text/xml");
		hm.put(".txt", "text/plain");
		hm.put(".uin", "application/x-icq");
		hm.put(".uls", "text/iuls");
		hm.put(".vcf", "text/x-vcard");
		hm.put(".vda", "application/x-vda");
		hm.put(".vdx", "application/vnd.visio");
		hm.put(".vml", "text/xml");
		hm.put(".vpg", "application/x-vpeg005");
		hm.put(".vsd", "application/vnd.visio");
		hm.put(".vsd", "application/x-vsd");
		hm.put(".vss", "application/vnd.visio");
		hm.put(".vst", "application/vnd.visio");
		hm.put(".vst", "application/x-vst");
		hm.put(".vsw", "application/vnd.visio");
		hm.put(".vsx", "application/vnd.visio");
		hm.put(".vtx", "application/vnd.visio");
		hm.put(".vxml", "text/xml");
		hm.put(".wav", "audio/wav");
		hm.put(".wax", "audio/x-ms-wax");
		hm.put(".wb1", "application/x-wb1");
		hm.put(".wb2", "application/x-wb2");
		hm.put(".wb3", "application/x-wb3");
		hm.put(".wbmp", "image/vnd.wap.wbmp");
		hm.put(".wiz", "application/msword");
		hm.put(".wk3", "application/x-wk3");
		hm.put(".wk4", "application/x-wk4");
		hm.put(".wkq", "application/x-wkq");
		hm.put(".wks", "application/x-wks");
		hm.put(".wm", "video/x-ms-wm");
		hm.put(".wma", "audio/x-ms-wma");
		hm.put(".wmd", "application/x-ms-wmd");
		hm.put(".wmf", "application/x-wmf");
		hm.put(".wml", "text/vnd.wap.wml");
		hm.put(".wmv", "video/x-ms-wmv");
		hm.put(".wmx", "video/x-ms-wmx");
		hm.put(".wmz", "application/x-ms-wmz");
		hm.put(".wp6", "application/x-wp6");
		hm.put(".wpd", "application/x-wpd");
		hm.put(".wpg", "application/x-wpg");
		hm.put(".wpl", "application/vnd.ms-wpl");
		hm.put(".wq1", "application/x-wq1");
		hm.put(".wr1", "application/x-wr1");
		hm.put(".wri", "application/x-wri");
		hm.put(".wrk", "application/x-wrk");
		hm.put(".ws", "application/x-ws");
		hm.put(".ws2", "application/x-ws");
		hm.put(".wsc", "text/scriptlet");
		hm.put(".wsdl", "text/xml");
		hm.put(".wvx", "video/x-ms-wvx");
		hm.put(".xdp", "application/vnd.adobe.xdp");
		hm.put(".xdr", "text/xml");
		hm.put(".xfd", "application/vnd.adobe.xfd");
		hm.put(".xfdf", "application/vnd.adobe.xfdf");
		hm.put(".xhtml", "text/html");
		hm.put(".xls", "application/vnd.ms-excel");
		hm.put(".xls", "application/x-xls");
		hm.put(".xlw", "application/x-xlw");
		hm.put(".xml", "text/xml");
		hm.put(".xpl", "audio/scpls");
		hm.put(".xq", "text/xml");
		hm.put(".xql", "text/xml");
		hm.put(".xquery", "text/xml");
		hm.put(".xsd", "text/xml");
		hm.put(".xsl", "text/xml");
		hm.put(".xslt", "text/xml");
		hm.put(".xwd", "application/x-xwd");
		hm.put(".x_b", "application/x-x_b");
		hm.put(".sis", "application/vnd.symbian.install");
		hm.put(".sisx", "application/vnd.symbian.install");
		hm.put(".x_t", "application/x-x_t");
		hm.put(".ipa", "application/vnd.iphone");
		hm.put(".apk", "application/vnd.android.package-archive");
		hm.put(".xap", "application/x-silverlight-app");
	}


	public static int getMaxExtLen() {
		if (maxKenLen>0)
			return maxKenLen;
		
		int len = 0;
		for (String k:hm.keySet()){
			if (k.length()>len){
				len = k.length();
			}
		}
		maxKenLen =  len;
		return maxKenLen;
	}



}