package dragon.bakuman.iu.roomexampleprk;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button mBtnAddUser, mBtnReadUser, mBtnDeleteUser, mBtnUpdateUser;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mBtnAddUser = view.findViewById(R.id.btnAddUser);
        mBtnAddUser.setOnClickListener(this);

        mBtnReadUser = view.findViewById(R.id.btnViewUser);
        mBtnReadUser.setOnClickListener(this);

        mBtnDeleteUser = view.findViewById(R.id.btnDeleteUser);
        mBtnDeleteUser.setOnClickListener(this);

        mBtnUpdateUser = view.findViewById(R.id.btnUpdateUser);
        mBtnUpdateUser.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnAddUser:
                MainActivity.sFragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.btnViewUser:
                MainActivity.sFragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.btnDeleteUser:
                MainActivity.sFragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.btnUpdateUser:
                MainActivity.sFragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateFragment()).addToBackStack(null).commit();

                break;

        }
    }
}
