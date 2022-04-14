package com.example.canteenblueapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CuisineDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CuisineDetailFragment extends Fragment {
    public static final String ITEM_EXTRA = "item_extra";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CuisineDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CuisineDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CuisineDetailFragment newInstance(String param1, String param2) {
        CuisineDetailFragment fragment = new CuisineDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cuisine_detail, container, false);
//        TextView tvName = view.findViewById(R.id.txt_name);
//        TextView tvPrice = view.findViewById(R.id.txt_price);
//        ImageView img = view.findViewById(R.id.dtl_img);
//        item item = getActivity().getIntent().getParcelableExtra(ITEM_EXTRA);
//        if (item !=null){
//            tvName.setText(item.getName());
//            tvPrice.setText(String.valueOf(item.getPrice()));
//            Glide.with(this)
//                    .load(item.getPic())
//                    .into(img);
//        }
        return view;
    }




}