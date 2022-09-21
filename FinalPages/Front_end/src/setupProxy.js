const { createProxyMiddleware } = require("http-proxy-middleware")

module.exports=app=>{
    app.use(
        createProxyMiddleware('/endpoint',{
            target:'url',
            changeOrigin:true
        })
        
    )
}