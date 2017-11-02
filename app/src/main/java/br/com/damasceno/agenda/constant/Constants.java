package br.com.damasceno.agenda.constant;

/**
 * Created by dmscn on 14/10/17.
 */

public interface Constants {
    // Tags
    public static final String TAG_LOG = "TAG_AGENDA";
    public static final String TAG_FRAG_WELCOME = "FRAG_WELCOME";
    public static final String TAG_FRAG_LOGIN = "FRAG_LOGIN";
    public static final String TAG_FRAG_REGISTER = "FRAG_REGISTER";
    public static final String TAG_REQUEST_LOGIN = "REQUEST_LOGIN";
    public static final String TAG_REQUEST_REGISTER = "REQUEST_REGISTER";
    public static final String TAG_REQUEST_ALL_TASKS = "REQUEST_ALL_TASKS";

    // Shared Preferences
    public static final String PREF_USER = "PREF_USER";
    public static final String KEY_CREDENTIALS_TOKEN = "KEY_CREDENTIALS_TOKEN";
    public static final String KEY_USER_ACCESS_TOKEN = "KEY_USER_ACCESS_TOKEN";
    public static final String KEY_USER_NAME = "KEY_USER_NAME";
    public static final String KEY_USER_EMAIL = "KEY_USER_EMAIL";
    public static final String KEY_USER_PICTURE = "KEY_USER_PICTURE";

    // Fragments
    public static final String FRAG_TASK_TITLE = "Tasks";
    public static final String FRAG_EVENT_TITLE = "Events";
    public static final String FRAG_CONTACT_TITLE = "Contacts";
}
