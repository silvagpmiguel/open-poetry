module.exports = {
  outputDir: 'target/dist',
  devServer: {
    proxy: {
      '/': {
        target: 'http://localhost:8080/',
        changeOrigin: false,
      },
    },
  },
}
