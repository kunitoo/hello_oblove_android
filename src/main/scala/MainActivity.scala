package my.android.project

import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.widget.TextView
import _root_.android.util.Log

class MainActivity extends Activity{
  override def onCreate(bundle: Bundle) {
    if(BuildConfig.DEBUG) Log.d("hello","MainActivity onCreate")
    super.onCreate(bundle)
    setContentView(R.layout.main)

    findViewById(R.id.textview).asInstanceOf[TextView].setText("hello, oblove")
  }
}
