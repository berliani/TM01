package model;

import model.Response;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddress = koneksisaya.buildURL   //request, build untuk string ke alamat ip
                ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");//request
        String response = koneksisaya.getResponseFromHttpUrl(myAddress);//response
        System.out.println(response);

        assert response !=null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<Response> Response = new ArrayList<Response>();
        int count = 0;
        for (int i=0; i<responseJSON.length();i++) {
            Response res = new Response();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
            res.setI_code(myJSONObject.getString("i_code"));
            res.setG_code(myJSONObject.getString("g_code"));
            res.setI_supp(myJSONObject.getString("i_supp"));
            res.setI_barcode(myJSONObject.getString("i_barcode"));
            res.setI_name(myJSONObject.getString("i_name"));
            res.setI_qty(myJSONObject.getString("i_qty"));
            res.setI_qtymin(myJSONObject.getString("i_qtymin"));
            res.setI_unit(myJSONObject.getString("i_unit"));
            res.setI_size(myJSONObject.getString("i_size"));
            res.setI_color(myJSONObject.getString("i_color"));
            res.setI_brands(myJSONObject.getString("i_brands"));
            res.setI_article(myJSONObject.getString("i_article"));
            res.setI_cogs(myJSONObject.getString("i_cogs"));
            res.setI_kdsell(myJSONObject.getString("i_kdsell"));
            res.setI_status(myJSONObject.getString("i_status"));
            res.setId(myJSONObject.getString("id"));
            String Harga = myJSONObject.getString("i_sell");
            res.setI_sell(Harga);
            Response.add(res);

            int HargaInt = Integer.parseInt(Harga);
            if (HargaInt <= 2000) {
                count++;
            }

            for (int index=0; index<Response.size();index++){
                int harga = Integer.parseInt(Response.get(index).getI_sell());
                if (HargaInt <= 2000) {
                    System.out.println("Harga : " + Harga);
                }
            }
            System.out.println("Jumlah Obat dengan Harga 2000 : " + count);


        }
    }
}
