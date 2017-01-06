package com.wisnukrn_.sqllitecrud.data;

import android.provider.BaseColumns;

/**
 * Created by wisnu on 05/01/2017.
 */

public class PetContract {
    private PetContract(){}

    public static final class PetEntry implements BaseColumns{
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "geder";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
