package id.fajriansyah.AplikasiCrud;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
/**
 * Created by JURNAS.INC on 13/08/2017.
 */

public interface RegisterAPI {


        @FormUrlEncoded
        @POST("/insert.php")
        Call<Value> daftar(@Field("npm") String npm,
                           @Field("nama") String nama,
                           @Field("kelas") String kelas,
                           @Field("sesi") String sesi);

}
