package dragon.bakuman.iu.roomexampleprk;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {

    private TextView mTextInfo;


    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);

        mTextInfo = view.findViewById(R.id.textDisplayInfo);

        //
        List<User> users = MainActivity.sMyAppDatabase.mMyDao().getUsers();

        String info = "";

        for (User usr : users) {


            int id = usr.getId();
            String name = usr.getName();
            String email = usr.getEmail();

            info = info + "\n\n" + "Id :" + id + "\n Name :" + name + "\n" + "Email :" + email;


        }

        mTextInfo.setText(info);


        return view;
    }

}
