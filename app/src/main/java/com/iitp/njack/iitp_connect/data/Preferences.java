package com.iitp.njack.iitp_connect.data;

import java.util.Set;

public interface Preferences {

    String getString(String key, String defaultValue);

    void saveString(String key, String value);

    long getLong(String key, long defaultValue);

    void setLong(String key, long value);

    Set<String> getStringSet(String key, Set<String> defaultValue);

    void saveStringSet(String key, Set<String> value);

    void addStringSetElement(String key, String value);
}
