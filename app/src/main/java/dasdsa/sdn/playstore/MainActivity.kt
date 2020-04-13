package dasdsa.sdn.playstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var mAppAdapter: AppAdapter? = null
    val appList = ArrayList<App>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appList.add(App(8000, "서울시 은평구", 4, "아파트 입니다."))
        appList.add(App(15000, "서울시 서대문구", 1, "연립주택 입니다."))
        appList.add(App(18000, "서울시 영등포구", -1, "연립주택 입니다."))
        appList.add(App(22000, "경기도 수원시", 0, "단독주택 입니다."))
        appList.add(App(17000, "서울시 성북구", -1, "연립주택 입니다."))
        appList.add(App(9000, "경기도 남양주시", 3, "단독주택 입니다."))
        appList.add(App(11000, "서울시 광진구", 24, "아파트 입니다."))


        mAppAdapter = AppAdapter(this, R.layout.app_list_item, appList)
        appListView.adapter = mAppAdapter
    }
}
