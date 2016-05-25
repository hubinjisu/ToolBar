package com.android.hubin.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.view_tool_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);//设置导航栏图标
        toolbar.setLogo(R.mipmap.ic_launcher);//设置app logo

        toolbar.setTitle("Title");//设置主标题
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));//设置主标题颜色
        toolbar.setTitleTextAppearance(this, R.style.Theme_ToolBar_Base_Title);//修改主标题的外观，包括文字颜色，文字大小等

        toolbar.setSubtitle("Subtitle");//设置子标题
        toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.darker_gray));//设置子标题颜色
        toolbar.setSubtitleTextAppearance(this, R.style.Theme_ToolBar_Base_Subtitle);//设置子标题的外观，包括文字颜色，文字大小等

        toolbar.inflateMenu(R.menu.tool_bar_menu);//设置右上角的填充菜单
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(MainActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(MainActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(MainActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(MainActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });
    }
}
