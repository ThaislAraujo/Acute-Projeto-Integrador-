import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class database extends SQLiteOpenHelper {
   private static final String NOME_BANCO = "banco_exemplo.db";
   private static final int VERSAO = 3;
   public database(Context context) {
       super(context, NOME_BANCO, null, VERSAO);
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
              sql = "CREATE TABLE usuarios ("
               + "idUsuario integer primary key autoincrement,"
               + "nome  text,"
               + "email text,"
               + "cpf   text,"
               + "senha text)";
       db.execSQL(sql);
       sql = "CREATE TABLE denuncia ("
               + "iddenuncia integer primary key autoincrement,"
               + "data  text,"
               + "hora  text,"
               + "email text)";
       db.execSQL(sql);
   }



   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
              db.execSQL("DROP TABLE IF EXISTS usuarios");
       db.execSQL("DROP TABLE IF EXISTS denuncia");
       onCreate(db);
   }
}

