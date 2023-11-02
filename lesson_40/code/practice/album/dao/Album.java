package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;

//часть 2
//Methods
public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId,int albumID);
    boolean updatePhoto(int photoId,int albumID,String url);

    Photo getPhotoFromAlbum(int photoId,int albumId);

    Photo[] getAllPhotosAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom,LocalDate dateTo);

    int size();//quantity of photos in all albums


}
