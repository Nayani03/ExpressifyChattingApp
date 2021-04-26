package chatting.app.expressifyproject1;

import androidx.appcompat.app.AppCompatActivity;
import chatting.app.expressifyproject1.databinding.ActivityGroupChatBinding;

import android.os.Bundle;

public class GroupChatActivity extends AppCompatActivity {
    ActivityGroupChatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityGroupChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}