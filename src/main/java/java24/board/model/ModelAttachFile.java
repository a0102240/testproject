package java24.board.model;

import java.util.Arrays;
import java.util.Date;

public class ModelAttachfile {
    
   private Integer attachfileno =null;  // `attachfileno` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
   private String filename      ="";  // `filename` VARCHAR(50) NOT NULL,
   private String filetype      ="";  // `filetype` VARCHAR(30) NULL DEFAULT NULL,
   private Integer filesize     =null;  // `filesize` INT(11) NULL DEFAULT NULL,
   private Integer articleno    =null;  // `articleno` INT(11) NULL DEFAULT NULL,
   private Date UseYN           =null;  // `UseYN` TINYINT(1) NULL DEFAULT '1',
   private String InsertUID     ="";  // `InsertUID` VARCHAR(40) NULL DEFAULT NULL,
   private String InsertDT      ="";  // `InsertDT` DATETIME NULL DEFAULT NULL,
   private String UpdateUID     ="";  // `UpdateUID` VARCHAR(40) NULL DEFAULT NULL,
   private Date UpdateDT        =null;  // `UpdateDT` DATETIME NULL DEFAULT NULL,
   private Byte[] imageData     =null;  // `imageData` LONGBLOB NULL,
      
   

public Integer getAttachfileno() {
    return attachfileno;
}
public void setAttachfileno(Integer attachfileno) {
    this.attachfileno = attachfileno;
}
public String getFilename() {
    return filename;
}
public void setFilename(String filename) {
    this.filename = filename;
}
public String getFiletype() {
    return filetype;
}
public void setFiletype(String filetype) {
    this.filetype = filetype;
}
public Integer getFilesize() {
    return filesize;
}
public void setFilesize(Integer filesize) {
    this.filesize = filesize;
}
public Integer getArticleno() {
    return articleno;
}
public void setArticleno(Integer articleno) {
    this.articleno = articleno;
}
public Date getUseYN() {
    return UseYN;
}
public void setUseYN(Date useYN) {
    UseYN = useYN;
}
public String getInsertUID() {
    return InsertUID;
}
public void setInsertUID(String insertUID) {
    InsertUID = insertUID;
}
public String getInsertDT() {
    return InsertDT;
}
public void setInsertDT(String insertDT) {
    InsertDT = insertDT;
}
public String getUpdateUID() {
    return UpdateUID;
}
public void setUpdateUID(String updateUID) {
    UpdateUID = updateUID;
}
public Date getUpdateDT() {
    return UpdateDT;
}
public void setUpdateDT(Date updateDT) {
    UpdateDT = updateDT;
}
public Byte[] getImageData() {
    return imageData;
}
public void setImageData(Byte[] imageData) {
    this.imageData = imageData;
}

@Override
public String toString() {
    return "ModelAttachfile [attachfileno=" + attachfileno + ", filename="
            + filename + ", filetype=" + filetype + ", filesize=" + filesize
            + ", articleno=" + articleno + ", UseYN=" + UseYN + ", InsertUID="
            + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
            + ", UpdateDT=" + UpdateDT + ", imageData="
            + Arrays.toString(imageData) + "]";
}

public ModelAttachfile() {
    super();
}      
    
}
