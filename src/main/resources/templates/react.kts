import io.spring.demo.include

"""
${include("header")}

    <div id="example"></div>

    <script type="text/babel">
         var myStyle = {
             fontSize: 200,
             color: '#FFFF00'
         };

         var HelloMessage = React.createClass({
              render: function() {
                return <h1 style = {myStyle} >Hello World！</h1>;
              }
            });

         ReactDOM.render(
            <HelloMessage />,
            document.getElementById('example')
         );
    </script>

${include("footer")}
"""
