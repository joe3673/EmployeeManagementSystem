const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CopyPlugin = require('copy-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');

module.exports = {
  mode: 'development', // Set the mode here
  entry: {
    index: path.resolve(__dirname, 'src', 'pages', 'index.js'),
    // Add other entry points as needed
  },
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: '[name].js',
  },
  devServer: {
    port: 9000, // Make sure this matches your intended port
    open: true,
    proxy: [
      {
        context: ['/api'],
        target: 'http://localhost:5001',
        secure: false,
      },
    ],
    static: {
      directory: path.join(__dirname, 'dist'),
    },
  },
  module: {
    rules: [
      {
        test: /\.js$/,
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['@babel/preset-env'],
          },
        },
      },
      // Add other loaders as needed
    ],
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: './src/index.html',
      filename: 'index.html',
      inject: 'body', // Adjust as needed
    }),
    new CopyPlugin({
      patterns: [
        {
          from: path.resolve(__dirname, 'src', 'css'),
          to: path.resolve(__dirname, 'dist', 'css'),
        },
      ],
    }),
    new CleanWebpackPlugin(),
  ],
};

