package com.example.android.miwok;

public class Word
{
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;
    boolean img=true;
    public Word(String defaultTranslation, String miwokTranslation, int Imageresource, int audioResource )
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=Imageresource;
        mAudioResourceId=audioResource;

    }
    public Word(String defaultTranslation, String miwokTranslation, int audioResource)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        img=false;
        mAudioResourceId=audioResource;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
    public boolean isImageAv()
    {
        return img;
    }
}
