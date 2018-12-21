package dragon.bakuman.iu.roomexampleprk;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateFragment extends Fragment {

    private EditText mUserIdUpdate, mUserNameUpdate, mUserEmailUpdate;
    private Button mBtnUpdate;


    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);

        mUserIdUpdate = view.findViewById(R.id.editTextIDUpdate);
        mUserEmailUpdate = view.findViewById(R.id.editTextEmailUpdate);
        mUserNameUpdate = view.findViewById(R.id.editTextNameUpdate);
        mBtnUpdate = view.findViewById(R.id.btnSaveUserUpdate);


        mBtnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(mUserIdUpdate.getText().toString());
                String name = mUserNameUpdate.getText().toString();
                String email = mUserEmailUpdate.getText().toString();


                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setEmail(email);

                MainActivity.sMyAppDatabase.mMyDao().updateUser(user);
                Toast.makeText(getActivity(), "user udpated", Toast.LENGTH_SHORT).show();

                mUserIdUpdate.setText("");
                mUserNameUpdate.setText("");
                mUserEmailUpdate.setText("");





            }
        });

        return view;
    }

}
