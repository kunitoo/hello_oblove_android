package my.android.project.tests

import my.android.project._
import junit.framework.Assert._
import _root_.android.test.AndroidTestCase
import _root_.android.test.ActivityInstrumentationTestCase2
import _root_.android.widget.TextView

class AndroidTests extends AndroidTestCase {
  def testPackageIsCorrect() {
    assertEquals("my.android.project", getContext.getPackageName)
  }
}

class ActivityTests extends ActivityInstrumentationTestCase2(classOf[MainActivity]) {
  var activity:MainActivity = _
  var textview:TextView = _

  override def setUp() {
    super.setUp()
    setActivityInitialTouchMode(false)
    activity = getActivity
    textview = activity.findViewById(my.android.project.R.id.textview).asInstanceOf[TextView]
  }
  def testHelloWorldIsShown() {
    assertEquals(textview.getText, "hello, world!")
  }
}
