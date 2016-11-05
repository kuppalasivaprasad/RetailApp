package co.onmymobile.retailapp.navigationdrawer;

/**
 * Created by omm on 11/2/2015.
 */
public class NavigationDrawerItem {
    private boolean showNotify;
    private String title;
    public int icons;

    public NavigationDrawerItem() {

    }


    public NavigationDrawerItem(boolean showNotify, String title, int icons) {
        this.showNotify = showNotify;
        this.title = title;
        this.icons = icons;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   /* public int getIcons() {
        return icons;
    }

    public void setIcons(int icons) {
        this.icons = icons;
    }*/


}