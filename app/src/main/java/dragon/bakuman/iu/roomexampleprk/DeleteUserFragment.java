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
public class DeleteUserFragment extends Fragment {


    private EditText mEditTextDelete;
    private Button mDeleteButton;

    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);

        mEditTextDelete = view.findViewById(R.id.editTextDelete);
        mDeleteButton = view.findViewById(R.id.delete);

        mDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(mEditTextDelete.getText().toString());
                User user = new User();
                user.setId(id);


                MainActivity.sMyAppDatabase.mMyDao().deleteUser(user);

                Toast.makeText(getActivity(), "user success removed", Toast.LENGTH_SHORT).show();

                mEditTextDelete.setText("");


            }
        });

        return view;
    }

}
