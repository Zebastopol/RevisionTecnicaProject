package com.example.revisiontecnicaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class registro extends Fragment {

    private FragmentFirstBinding binding;

    Button   btnGuardar, btnFotografia, btnVerFoto, btnGuardarFoto;
    EditText txtCodigoIngreso, txtFechaHora, txtDocumentos, txtPatente, txtSistema,
             txtFrenos, txtNeumaticos_y_llantas, txtSuspencion, txtAlineacion,txtKit_De_Seguridad,
             txtCinturones_De_Seguridad, txtLuces,txtPuertas, txtVidrios, txtTubo_De_Escape, txtGases,
             txtObservaciones;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public registro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment registro.
     */
    // TODO: Rename and change types and number of parameters
    public static registro newInstance(String param1, String param2) {
        registro fragment = new registro();
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
        binding = FragmentFisrtBinding.inflate(inflater, container,false);
        View view = binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registro, container, false);
    }
}