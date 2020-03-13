package br.edu.ifsul.vendas20202.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import br.edu.ifsul.vendas20202.R;

public class ProdutoAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_admin);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_produto_admin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuitem_barcode_admin:
                Toast.makeText(this, "Clicou botão código de barrras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuitem_limparform_admin:
                Toast.makeText(this, "Clicou botão código de barrras", Toast.LENGTH_SHORT).show();
                //limparForm();
                break;
        }

        return true;
    }
}
