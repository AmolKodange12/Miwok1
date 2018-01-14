package com.example.android.miwok;

/**
 * Created by admin on 1/4/2018.
 */

public class Word {

    /** Default translation of the word*/
    private String mDefaultTranslation;

    /** Miwok translation of the word */
    private String mMiwokTranslation;



    /** Drawable resource id */
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    /** Constructor for the word class*/
    public Word(String DefaultTranslation,String MiwokTranlation,int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranlation;
        mAudioResourceId=AudioResourceId;

    }
    public Word(String DefaultTranslation,String MiwokTranlation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranlation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }

    /**Method to get default translation of a word,no inputs since sole purpose to return value*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**Method to get miwok translation of a word,no inputs since sole purpose to return value*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    /**Method to get the image of a word,no inputs since sole purpose to return value*/
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**Method to return a boolean value based on whether the image exists for item on the listarray
     * NO_IMAGE_PROVIDED has a calue of -1,if the image exists the resourceID is not -1 and true is returned*/
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
