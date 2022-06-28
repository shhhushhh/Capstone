//package com.example.capstone.fragments;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import com.example.capstone.ArchiveAdapter;
//import com.example.capstone.LoginActivity;
//import com.example.capstone.R;
//import com.example.capstone.models.Poem;
//import com.parse.ParseUser;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ArchiveFragment extends Fragment {
//
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private Button bLogout;
//    protected ArchiveAdapter adapter;
//    protected List<Poem> allPosts;
//    private RecyclerView rvPoems;
//
//    private String mParam1;
//    private String mParam2;
//
//    public ArchiveFragment() {
//        // Required empty public constructor
//    }
//
//    public static ArchiveFragment newInstance(String param1, String param2) {
//        ArchiveFragment fragment = new ArchiveFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_archive, container, false);
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        bLogout = view.findViewById(R.id.bLogout);
//        bLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ParseUser.logOutInBackground();
//                ParseUser currentUser = ParseUser.getCurrentUser(); // this will now be null
//                Intent intent = new Intent(getActivity(), LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//        rvPoems = view.findViewById(R.id.rvPoems);
//        allPosts = new ArrayList<Poem>();
//        adapter = new ArchiveAdapter(view.getContext(), allPosts);
//
//        rvPoems.setAdapter(adapter);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
//        rvPoems.setLayoutManager(linearLayoutManager);
//        queryPosts();
//    }
//}