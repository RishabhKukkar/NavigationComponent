package in.navigationcomponent.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.navigationcomponent.MainActivity;
import in.navigationcomponent.R;

import static in.navigationcomponent.utils.ConstantUtils.NAME;

public class SecondFragment extends Fragment {
    private View view;

    @BindView(R.id.mtbNavigateThirdFragment)
    MaterialButton mtbNavigateThirdFragment;


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mtbNavigateThirdFragment.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString(getString(R.string.name), NAME);
            MainActivity.navController.navigate(R.id.action_secondFragment_to_thirdFragment, bundle);
        });
    }
}