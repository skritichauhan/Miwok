package com.example.android.miwok;

public class Word
{
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    boolean img=true;
    public Word(String defaultTranslation, String miwokTranslation, int resource)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=resource;

    }
    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        img=false;
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
    public boolean isImageAv()
    {
        return img;
    }
}
