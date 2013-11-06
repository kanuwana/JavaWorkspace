Ext.require (Ext.container.Viewport);

Ext.application({
    name: 'HelloExtJS4',
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    title: 'Hello ExtJS 4',
                    html : 'Hello! Welcome to Ext JS 4. Go ahead'
                }
            ]
        });
    }
});