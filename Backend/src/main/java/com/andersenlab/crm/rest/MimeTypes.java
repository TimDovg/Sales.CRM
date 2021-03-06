package com.andersenlab.crm.rest;

/**
 * Map file extensions to MIME types. Based on the Apache mime.types file.
 * http://www.iana.org/assignments/media-types/
 * <p>
 * <p>
 * "xul", MIME_APPLICATION_VND_MOZZILLA_XUL_XML);
 * "json", MIME_APPLICATION_JSON);
 * "ice", MIME_X_CONFERENCE_X_COOLTALK);
 * "movie", MIME_VIDEO_X_SGI_MOVIE);
 * "avi", MIME_VIDEO_X_MSVIDEO);
 * "wmv", MIME_VIDEO_X_MS_WMV);
 * "m4u", MIME_VIDEO_VND_MPEGURL);
 * "mxu", MIME_VIDEO_VND_MPEGURL);
 * "htc", MIME_TEXT_X_COMPONENT);
 * "etx", MIME_TEXT_X_SETEXT);
 * "wmls", MIME_TEXT_VND_WAP_WMLSCRIPT);
 * "wml", MIME_TEXT_VND_WAP_XML);
 * "tsv", MIME_TEXT_TAB_SEPARATED_VALUES);
 * "sgm", MIME_TEXT_SGML);
 * "sgml", MIME_TEXT_SGML);
 * "css", MIME_TEXT_CSS);
 * "ifb", MIME_TEXT_CALENDAR);
 * "ics", MIME_TEXT_CALENDAR);
 * "wrl", MIME_MODEL_VRLM);
 * "vrlm", MIME_MODEL_VRLM);
 * "silo", MIME_MODEL_MESH);
 * "mesh", MIME_MODEL_MESH);
 * "msh", MIME_MODEL_MESH);
 * "iges", MIME_MODEL_IGES);
 * "igs", MIME_MODEL_IGES);
 * "rgb", MIME_IMAGE_X_RGB);
 * "ppm", MIME_IMAGE_X_PORTABLE_PIXMAP);
 * "pgm", MIME_IMAGE_X_PORTABLE_GRAYMAP);
 * "pbm", MIME_IMAGE_X_PORTABLE_BITMAP);
 * "pnm", MIME_IMAGE_X_PORTABLE_ANYMAP);
 * "ico", MIME_IMAGE_X_ICON);
 * "ras", MIME_IMAGE_X_CMU_RASTER);
 * "wbmp", MIME_IMAGE_WAP_WBMP);
 * "djv", MIME_IMAGE_VND_DJVU);
 * "djvu", MIME_IMAGE_VND_DJVU);
 * "svg", MIME_IMAGE_SVG_XML);
 * "ief", MIME_IMAGE_IEF);
 * "cgm", MIME_IMAGE_CGM);
 * "bmp", MIME_IMAGE_BMP);
 * "xyz", MIME_CHEMICAL_X_XYZ);
 * "pdb", MIME_CHEMICAL_X_PDB);
 * "ra", MIME_AUDIO_X_PN_REALAUDIO);
 * "ram", MIME_AUDIO_X_PN_REALAUDIO);
 * "m3u", MIME_AUDIO_X_MPEGURL);
 * "aifc", MIME_AUDIO_X_AIFF);
 * "aif", MIME_AUDIO_X_AIFF);
 * "aiff", MIME_AUDIO_X_AIFF);
 * "mp3", MIME_AUDIO_MPEG);
 * "mp2", MIME_AUDIO_MPEG);
 * "mp1", MIME_AUDIO_MPEG);
 * "mpga", MIME_AUDIO_MPEG);
 * "kar", MIME_AUDIO_MIDI);
 * "mid", MIME_AUDIO_MIDI);
 * "midi", MIME_AUDIO_MIDI);
 * "dtd", MIME_APPLICATION_XML_DTD);
 * "xsl", MIME_APPLICATION_XML);
 * "xml", MIME_APPLICATION_XML);
 * "xslt", MIME_APPLICATION_XSLT_XML);
 * "xht", MIME_APPLICATION_XHTML_XML);
 * "xhtml", MIME_APPLICATION_XHTML_XML);
 * "src", MIME_APPLICATION_X_WAIS_SOURCE);
 * "ustar", MIME_APPLICATION_X_USTAR);
 * "ms", MIME_APPLICATION_X_TROFF_MS);
 * "me", MIME_APPLICATION_X_TROFF_ME);
 * "man", MIME_APPLICATION_X_TROFF_MAN);
 * "roff", MIME_APPLICATION_X_TROFF);
 * "tr", MIME_APPLICATION_X_TROFF);
 * "t", MIME_APPLICATION_X_TROFF);
 * "texi", MIME_APPLICATION_X_TEXINFO);
 * "texinfo", MIME_APPLICATION_X_TEXINFO);
 * "tex", MIME_APPLICATION_X_TEX);
 * "tcl", MIME_APPLICATION_X_TCL);
 * "sv4crc", MIME_APPLICATION_X_SV4CRC);
 * "sv4cpio", MIME_APPLICATION_X_SV4CPIO);
 * "sit", MIME_APPLICATION_X_STUFFIT);
 * "swf", MIME_APPLICATION_X_SHOCKWAVE_FLASH);
 * "shar", MIME_APPLICATION_X_SHAR);
 * "sh", MIME_APPLICATION_X_SH);
 * "cdf", MIME_APPLICATION_X_NETCDF);
 * "nc", MIME_APPLICATION_X_NETCDF);
 * "latex", MIME_APPLICATION_X_LATEX);
 * "skm", MIME_APPLICATION_X_KOAN);
 * "skt", MIME_APPLICATION_X_KOAN);
 * "skd", MIME_APPLICATION_X_KOAN);
 * "skp", MIME_APPLICATION_X_KOAN);
 * "js", MIME_APPLICATION_X_JAVASCRIPT);
 * "hdf", MIME_APPLICATION_X_HDF);
 * "gtar", MIME_APPLICATION_X_GTAR);
 * "spl", MIME_APPLICATION_X_FUTURESPLASH);
 * "dvi", MIME_APPLICATION_X_DVI);
 * "dxr", MIME_APPLICATION_X_DIRECTOR);
 * "dir", MIME_APPLICATION_X_DIRECTOR);
 * "dcr", MIME_APPLICATION_X_DIRECTOR);
 * "csh", MIME_APPLICATION_X_CSH);
 * "cpio", MIME_APPLICATION_X_CPIO);
 * "pgn", MIME_APPLICATION_X_CHESS_PGN);
 * "vcd", MIME_APPLICATION_X_CDLINK);
 * "bcpio", MIME_APPLICATION_X_BCPIO);
 * "rm", MIME_APPLICATION_VND_RNREALMEDIA);
 * "ppt", MIME_APPLICATION_VND_MSPOWERPOINT);
 * "mif", MIME_APPLICATION_VND_MIF);
 * "grxml", MIME_APPLICATION_SRGS_XML);
 * "gram", MIME_APPLICATION_SRGS);
 * "smil", MIME_APPLICATION_RDF_SMIL);
 * "smi", MIME_APPLICATION_RDF_SMIL);
 * "rdf", MIME_APPLICATION_RDF_XML);
 * "ogg", MIME_APPLICATION_X_OGG);
 * "oda", MIME_APPLICATION_ODA);
 * "dmg", MIME_APPLICATION_OCTET_STREAM);
 * "lzh", MIME_APPLICATION_OCTET_STREAM);
 * "so", MIME_APPLICATION_OCTET_STREAM);
 * "lha", MIME_APPLICATION_OCTET_STREAM);
 * "dms", MIME_APPLICATION_OCTET_STREAM);
 * "bin", MIME_APPLICATION_OCTET_STREAM);
 * "mathml", MIME_APPLICATION_MATHML_XML);
 * "cpt", MIME_APPLICATION_MAC_COMPACTPRO);
 * "hqx", MIME_APPLICATION_MAC_BINHEX40);
 * "jnlp", MIME_APPLICATION_JNLP);
 * "ez", MIME_APPLICATION_ANDREW_INSET);
 * "txt", MIME_TEXT_PLAIN);
 * "ini", MIME_TEXT_PLAIN);
 * "c", MIME_TEXT_PLAIN);
 * "h", MIME_TEXT_PLAIN);
 * "cpp", MIME_TEXT_PLAIN);
 * "cxx", MIME_TEXT_PLAIN);
 * "cc", MIME_TEXT_PLAIN);
 * "chh", MIME_TEXT_PLAIN);
 * "java", MIME_TEXT_PLAIN);
 * "csv", MIME_TEXT_PLAIN);
 * "bat", MIME_TEXT_PLAIN);
 * "cmd", MIME_TEXT_PLAIN);
 * "asc", MIME_TEXT_PLAIN);
 * "rtf", MIME_TEXT_RTF);
 * "rtx", MIME_TEXT_RICHTEXT);
 * "html", MIME_TEXT_HTML);
 * "htm", MIME_TEXT_HTML);
 * "zip", MIME_APPLICATION_ZIP);
 * "rar", MIME_APPLICATION_X_RAR_COMPRESSED);
 * "gzip", MIME_APPLICATION_X_GZIP);
 * "gz", MIME_APPLICATION_X_GZIP);
 * "tgz", MIME_APPLICATION_TGZ);
 * "tar", MIME_APPLICATION_X_TAR);
 * "gif", MIME_IMAGE_GIF);
 * "jpeg", MIME_IMAGE_JPEG);
 * "jpg", MIME_IMAGE_JPEG);
 * "jpe", MIME_IMAGE_JPEG);
 * "tiff", MIME_IMAGE_TIFF);
 * "tif", MIME_IMAGE_TIFF);
 * "png", MIME_IMAGE_PNG);
 * "au", MIME_AUDIO_BASIC);
 * "snd", MIME_AUDIO_BASIC);
 * "wav", MIME_AUDIO_X_WAV);
 * "mov", MIME_VIDEO_QUICKTIME);
 * "qt", MIME_VIDEO_QUICKTIME);
 * "mpeg", MIME_VIDEO_MPEG);
 * "mpg", MIME_VIDEO_MPEG);
 * "mpe", MIME_VIDEO_MPEG);
 * "abs", MIME_VIDEO_MPEG);
 * "doc", MIME_APPLICATION_MSWORD);
 * "xls", MIME_APPLICATION_VND_MSEXCEL);
 * "eps", MIME_APPLICATION_POSTSCRIPT);
 * "ai", MIME_APPLICATION_POSTSCRIPT);
 * "ps", MIME_APPLICATION_POSTSCRIPT);
 * "pdf", MIME_APPLICATION_PDF);
 * "exe", MIME_APPLICATION_OCTET_STREAM);
 * "dll", MIME_APPLICATION_OCTET_STREAM);
 * "class", MIME_APPLICATION_OCTET_STREAM);
 * "jar", MIME_APPLICATION_JAVA_ARCHIVE);
 * "docx", MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT);
 * "xlsx", MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET);
 * "pptx", MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION);
 * "odt", MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT);
 * "ods", MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET);
 * "odg", MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS);
 * "odp", MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION);
 */
public final class MimeTypes {
    public static final String MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
    public static final String MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static final String MIME_APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
    public static final String MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT = "application/vnd.oasis.opendocument.text";
    public static final String MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET = "application/vnd.oasis.opendocument.spreadsheet";
    public static final String MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS = "application/vnd.oasis.opendocument.graphics";
    public static final String MIME_APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION = "application/vnd.oasis.opendocument.presentation";
    public static final String MIME_APPLICATION_ANDREW_INSET = "application/andrew-inset";
    public static final String MIME_APPLICATION_JSON = "application/json";
    public static final String MIME_APPLICATION_ZIP = "application/zip";
    public static final String MIME_APPLICATION_X_GZIP = "application/x-gzip";
    public static final String MIME_APPLICATION_TGZ = "application/tgz";
    public static final String MIME_APPLICATION_MSWORD = "application/msword";
    public static final String MIME_APPLICATION_POSTSCRIPT = "application/postscript";
    public static final String MIME_APPLICATION_PDF = "application/pdf";
    public static final String MIME_APPLICATION_JNLP = "application/jnlp";
    public static final String MIME_APPLICATION_MAC_BINHEX40 = "application/mac-binhex40";
    public static final String MIME_APPLICATION_MAC_COMPACTPRO = "application/mac-compactpro";
    public static final String MIME_APPLICATION_MATHML_XML = "application/mathml+xml";
    public static final String MIME_APPLICATION_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_APPLICATION_ODA = "application/oda";
    public static final String MIME_APPLICATION_RDF_XML = "application/rdf+xml";
    public static final String MIME_APPLICATION_JAVA_ARCHIVE = "application/java-archive";
    public static final String MIME_APPLICATION_RDF_SMIL = "application/smil";
    public static final String MIME_APPLICATION_SRGS = "application/srgs";
    public static final String MIME_APPLICATION_SRGS_XML = "application/srgs+xml";
    public static final String MIME_APPLICATION_VND_MIF = "application/vnd.mif";
    public static final String MIME_APPLICATION_VND_MSEXCEL = "application/vnd.ms-excel";
    public static final String MIME_APPLICATION_VND_MSPOWERPOINT = "application/vnd.ms-powerpoint";
    public static final String MIME_APPLICATION_VND_RNREALMEDIA = "application/vnd.rn-realmedia";
    public static final String MIME_APPLICATION_X_BCPIO = "application/x-bcpio";
    public static final String MIME_APPLICATION_X_CDLINK = "application/x-cdlink";
    public static final String MIME_APPLICATION_X_CHESS_PGN = "application/x-chess-pgn";
    public static final String MIME_APPLICATION_X_CPIO = "application/x-cpio";
    public static final String MIME_APPLICATION_X_CSH = "application/x-csh";
    public static final String MIME_APPLICATION_X_DIRECTOR = "application/x-director";
    public static final String MIME_APPLICATION_X_DVI = "application/x-dvi";
    public static final String MIME_APPLICATION_X_FUTURESPLASH = "application/x-futuresplash";
    public static final String MIME_APPLICATION_X_GTAR = "application/x-gtar";
    public static final String MIME_APPLICATION_X_HDF = "application/x-hdf";
    public static final String MIME_APPLICATION_X_JAVASCRIPT = "application/x-javascript";
    public static final String MIME_APPLICATION_X_KOAN = "application/x-koan";
    public static final String MIME_APPLICATION_X_LATEX = "application/x-latex";
    public static final String MIME_APPLICATION_X_NETCDF = "application/x-netcdf";
    public static final String MIME_APPLICATION_X_OGG = "application/x-ogg";
    public static final String MIME_APPLICATION_X_SH = "application/x-sh";
    public static final String MIME_APPLICATION_X_SHAR = "application/x-shar";
    public static final String MIME_APPLICATION_X_SHOCKWAVE_FLASH = "application/x-shockwave-flash";
    public static final String MIME_APPLICATION_X_STUFFIT = "application/x-stuffit";
    public static final String MIME_APPLICATION_X_SV4CPIO = "application/x-sv4cpio";
    public static final String MIME_APPLICATION_X_SV4CRC = "application/x-sv4crc";
    public static final String MIME_APPLICATION_X_TAR = "application/x-tar";
    public static final String MIME_APPLICATION_X_RAR_COMPRESSED = "application/x-rar-compressed";
    public static final String MIME_APPLICATION_X_TCL = "application/x-tcl";
    public static final String MIME_APPLICATION_X_TEX = "application/x-tex";
    public static final String MIME_APPLICATION_X_TEXINFO = "application/x-texinfo";
    public static final String MIME_APPLICATION_X_TROFF = "application/x-troff";
    public static final String MIME_APPLICATION_X_TROFF_MAN = "application/x-troff-man";
    public static final String MIME_APPLICATION_X_TROFF_ME = "application/x-troff-me";
    public static final String MIME_APPLICATION_X_TROFF_MS = "application/x-troff-ms";
    public static final String MIME_APPLICATION_X_USTAR = "application/x-ustar";
    public static final String MIME_APPLICATION_X_WAIS_SOURCE = "application/x-wais-source";
    public static final String MIME_APPLICATION_VND_MOZZILLA_XUL_XML = "application/vnd.mozilla.xul+xml";
    public static final String MIME_APPLICATION_XHTML_XML = "application/xhtml+xml";
    public static final String MIME_APPLICATION_XSLT_XML = "application/xslt+xml";
    public static final String MIME_APPLICATION_XML = "application/xml";
    public static final String MIME_APPLICATION_XML_DTD = "application/xml-dtd";
    public static final String MIME_IMAGE_BMP = "image/bmp";
    public static final String MIME_IMAGE_CGM = "image/cgm";
    public static final String MIME_IMAGE_GIF = "image/gif";
    public static final String MIME_IMAGE_IEF = "image/ief";
    public static final String MIME_IMAGE_JPEG = "image/jpeg";
    public static final String MIME_IMAGE_TIFF = "image/tiff";
    public static final String MIME_IMAGE_PNG = "image/png";
    public static final String MIME_IMAGE_SVG_XML = "image/svg+xml";
    public static final String MIME_IMAGE_VND_DJVU = "image/vnd.djvu";
    public static final String MIME_IMAGE_WAP_WBMP = "image/vnd.wap.wbmp";
    public static final String MIME_IMAGE_X_CMU_RASTER = "image/x-cmu-raster";
    public static final String MIME_IMAGE_X_ICON = "image/x-icon";
    public static final String MIME_IMAGE_X_PORTABLE_ANYMAP = "image/x-portable-anymap";
    public static final String MIME_IMAGE_X_PORTABLE_BITMAP = "image/x-portable-bitmap";
    public static final String MIME_IMAGE_X_PORTABLE_GRAYMAP = "image/x-portable-graymap";
    public static final String MIME_IMAGE_X_PORTABLE_PIXMAP = "image/x-portable-pixmap";
    public static final String MIME_IMAGE_X_RGB = "image/x-rgb";
    public static final String MIME_AUDIO_BASIC = "audio/basic";
    public static final String MIME_AUDIO_MIDI = "audio/midi";
    public static final String MIME_AUDIO_MPEG = "audio/mpeg";
    public static final String MIME_AUDIO_X_AIFF = "audio/x-aiff";
    public static final String MIME_AUDIO_X_MPEGURL = "audio/x-mpegurl";
    public static final String MIME_AUDIO_X_PN_REALAUDIO = "audio/x-pn-realaudio";
    public static final String MIME_AUDIO_X_WAV = "audio/x-wav";
    public static final String MIME_CHEMICAL_X_PDB = "chemical/x-pdb";
    public static final String MIME_CHEMICAL_X_XYZ = "chemical/x-xyz";
    public static final String MIME_MODEL_IGES = "model/iges";
    public static final String MIME_MODEL_MESH = "model/mesh";
    public static final String MIME_MODEL_VRLM = "model/vrml";
    public static final String MIME_TEXT_PLAIN = "text/plain";
    public static final String MIME_TEXT_RICHTEXT = "text/richtext";
    public static final String MIME_TEXT_RTF = "text/rtf";
    public static final String MIME_TEXT_HTML = "text/html";
    public static final String MIME_TEXT_CALENDAR = "text/calendar";
    public static final String MIME_TEXT_CSS = "text/css";
    public static final String MIME_TEXT_SGML = "text/sgml";
    public static final String MIME_TEXT_TAB_SEPARATED_VALUES = "text/tab-separated-values";
    public static final String MIME_TEXT_VND_WAP_XML = "text/vnd.wap.wml";
    public static final String MIME_TEXT_VND_WAP_WMLSCRIPT = "text/vnd.wap.wmlscript";
    public static final String MIME_TEXT_X_SETEXT = "text/x-setext";
    public static final String MIME_TEXT_X_COMPONENT = "text/x-component";
    public static final String MIME_VIDEO_QUICKTIME = "video/quicktime";
    public static final String MIME_VIDEO_MPEG = "video/mpeg";
    public static final String MIME_VIDEO_VND_MPEGURL = "video/vnd.mpegurl";
    public static final String MIME_VIDEO_X_MSVIDEO = "video/x-msvideo";
    public static final String MIME_VIDEO_X_MS_WMV = "video/x-ms-wmv";
    public static final String MIME_VIDEO_X_SGI_MOVIE = "video/x-sgi-movie";
    public static final String MIME_X_CONFERENCE_X_COOLTALK = "x-conference/x-cooltalk";

    private MimeTypes() {
    }
}

