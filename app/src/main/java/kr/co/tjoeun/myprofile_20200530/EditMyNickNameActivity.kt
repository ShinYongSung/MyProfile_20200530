package kr.co.tjoeun.myprofile_20200530

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_my_nick_name.*

class EditMyNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_my_nick_name)

        val nickName = intent.getStringExtra("nowNickName")

        nickNameEdt.setText(nickName)

        okBtn.setOnClickListener {
//            바꾸려는 닉네임을 받아서 => 결과로 설정하고 => 종료

            val nick = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nickName", nick)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()

        }

    }
}
