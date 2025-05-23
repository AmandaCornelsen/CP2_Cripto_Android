package AmandaCornelsen.com.github.cp2_criptomoeda.service

import AmandaCornelsen.com.github.cp2_criptomoeda.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}