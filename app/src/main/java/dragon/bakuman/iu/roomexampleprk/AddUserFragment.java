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
public class AddUserFragment extends Fragment {

    private EditText mUserId, mUserName, mUserEmail;
    private Button btnSave;


    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);

        mUserEmail = view.findViewById(R.id.editTextEmailUpdate);
        mUserName = view.findViewById(R.id.editTextNameUpdate);
        mUserId = view.findViewById(R.id.editTextIDUpdate);
        btnSave = view.findViewById(R.id.btnSaveUserUpdate);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mUserName.getText().toString();
                int userid = Integer.parseInt(mUserId.getText().toString());
                String useremail = mUserEmail.getText().toString();


                //object of the entity class
                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                //save this above information in the database
                MainActivity.sMyAppDatabase.mMyDao().addUser(user);
                Toast.makeText(getActivity(), "user added success", Toast.LENGTH_SHORT).show();

                mUserId.setText("");
                mUserName.setText("");
                mUserEmail.setText("");


            }
        });

        return view;


    }

}
